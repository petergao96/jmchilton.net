
(use '(net.jmchilton.www cache google))

(defn build-subscription-html [subscription]
  (let [href (str view-url (:id subscription))
        title (:title subscription)]
    [:li [:a {"href" href} title]]))

(defn build-label-list-html [label-map-entry]
  [:li (key label-map-entry)
    `[:ul ~@(map build-subscription-html (val label-map-entry))]])    

(defn build-page-html []
  (let [subscription-list (get-subscription-list)
        label-map (build-label-map subscription-list "*unlabelled*")]
    `[:div {"class" "treeList"}
       [:ul ~@(map build-label-list-html (seq label-map))]]))

(handle-cache-timed
  (* 1000 60 60 4)
  "blogroll"
  build-page-html)