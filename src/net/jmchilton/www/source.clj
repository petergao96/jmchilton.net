(ns net.jmchilton.www.source)

(use '(net.jmchilton.www id io source))

;; Location of Genshi based highlighting script
(def highlight-script "scripts/highlight.php")

;; File extensions and the corresponding Genshi type.
(def source-extensions
  {"clj" "scheme"
   "scm" "scheme"
   "php" "php"
   "m" "matlab"
   "c" "c"
   "css" "css"
   "html" "html"
   "htm" "html"})

(defn valid-source-content-id? [content-id]
  (and (valid-content-id? content-id)
       (contains? source-extensions (get-content-extension content-id))))

(defn get-highlighted-source [source-file]
  (let [extension (get-content-extension source-file)
        source-type (get source-extensions extension)
        ;; Warning Procedural Code Below!
        process-builder (new java.lang.ProcessBuilder 
                        ["php" highlight-script source-file source-type])
        process (. process-builder start)
        process-output-stream (. process getInputStream)
        process-return-value (. process waitFor)]
    (stream->string process-output-stream)))


(defn- file-comparator [x y]
  (let [x-is-dir? (.isDirectory x)
        y-is-dir? (.isDirectory y)]
    (cond (= x-is-dir? y-is-dir?) (compare x y)
           x-is-dir? -1
           :else 1)))

(defn- make-directory-tree [file]
  (if (.isDirectory file)
      (cons file (map make-directory-tree (sort file-comparator (.listFiles file))))
      file))

(defn- tree-walker [tree]
  (if (seq? tree)
    (if (not (empty? (rest tree)))
      [:li (str (.getName (first tree)) "/")
        `[:ul ~@(map tree-walker (rest tree))]])
    (let [path (.getPath tree)
          page-link [:a {"href" path} (.getName tree)]
          extension (get-extension path)
          source? (contains? source-extensions extension)]
      `[:li [:a {"href" ~path} ~(.getName tree)]
         ~@(if source?
           `((" [" ~(net.jmchilton.www.page/view-source-link
                      (file->content-id tree)
                      "View Source")
              "]"))
           '(()))])))

(defn get-directory-list-html [path show-root?]
  (let [root-tree (make-directory-tree (file path))]
    `[:ul
      ~@(if show-root?
           (tree-walker root-tree)
           (map tree-walker (rest root-tree)))]))