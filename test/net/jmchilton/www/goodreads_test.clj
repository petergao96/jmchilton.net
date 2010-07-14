(ns net.jmchilton.www.goodreads-test
  (:use 
    clojure.test
    clojure.xml
    (net.jmchilton.www goodreads)))

(def raw-list-response {:tag :GoodreadsResponse, :attrs nil, :content [{:tag :Request, :attrs nil, :content [{:tag :authentication, :attrs nil, :content ["true"]} {:tag :key, :attrs nil, :content ["Gz1fE1NB9Ds04uBMR2JdA"]} {:tag :method, :attrs nil, :content ["review_list"]}]} {:tag :reviews, :attrs {:start "1", :end "5", :total "5"}, :content [{:tag :review, :attrs nil, :content [{:tag :id, :attrs nil, :content ["110833399"]} {:tag :book, :attrs nil, :content [{:tag :id, :attrs {:type "integer"}, :content ["108986"]} {:tag :isbn, :attrs nil, :content ["0262032937"]} {:tag :isbn13, :attrs nil, :content ["9780262032933"]} {:tag :text_reviews_count, :attrs {:type "integer"}, :content ["19"]} {:tag :title, :attrs nil, :content ["\n    Introduction to Algorithms, Second Edition\n  "]} {:tag :image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1171595977m/108986.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1171595977s/108986.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/book/show/108986.Introduction_to_Algorithms_Second_Edition"]} {:tag :average_rating, :attrs nil, :content ["4.22"]} {:tag :ratings_count, :attrs nil, :content ["250"]} {:tag :description, :attrs nil, :content ["\n    The updated new edition of the classic Introduction to Algorithms is intended primarily for use in undergraduate or graduate courses in algorithms or data structures.  Like the first edition,this text can also be used for self-study by technical professionals since it discusses engineering issues in algorithm design as well as the mathematical aspects.  <p>In its new edition,Introduction to Algorithms continues to provide a comprehensive introduction to the modern study of algorithms.  The revision has been updated to reflect changes in the years since the book's original publication.  New chapters on the role of algorithms in computing and on probabilistic analysis and randomized algorithms have been included.  Sections throughout the book have been rewritten for increased clarity,and material has been added wherever a fuller explanation has seemed useful or new information warrants expanded coverage.  <p>As in the classic first edition,this new edition of Introduction to Algorithms presents a rich variety of algorithms and covers them in considerable depth while making their design and analysis accessible to all levels of readers.  Further,the algorithms are presented in pseudocode to make the book easily accessible to students from all programming language backgrounds.  <p> Each chapter presents an algorithm,a design technique,an application area,or a related topic.  The chapters are not dependent on one another,so the instructor can organize his or her use of the book in the way that best suits the course's needs.  Additionally,the new edition offers a 25% increase over the first edition in the number of problems,giving the book 155 problems and over 900 exercises thatreinforcethe concepts the students are learning.</p></p></p>\n  "]} {:tag :authors, :attrs nil, :content [{:tag :author, :attrs nil, :content [{:tag :id, :attrs nil, :content ["60841"]} {:tag :name, :attrs nil, :content ["Thomas H. Cormen"]} {:tag :image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-M-200x266.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-M-50x66.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/author/show/60841.Thomas_H_Cormen"]} {:tag :average_rating, :attrs nil, :content ["4.22"]} {:tag :ratings_count, :attrs nil, :content ["250"]} {:tag :text_reviews_count, :attrs nil, :content ["23"]}]}]} {:tag :published, :attrs nil, :content ["1990"]}]} {:tag :rating, :attrs nil, :content ["3"]} {:tag :votes, :attrs nil, :content ["0"]} {:tag :spoiler_flag, :attrs nil, :content ["false"]} {:tag :shelves, :attrs nil, :content [{:tag :shelf, :attrs {:name "read"}, :content nil} {:tag :shelf, :attrs {:name "highly-recommended"}, :content nil}]} {:tag :recommended_for, :attrs nil, :content nil} {:tag :recommended_by, :attrs nil, :content nil} {:tag :started_at, :attrs nil, :content ["Wed Jan 01 00:00:00 -0800 2003"]} {:tag :read_at, :attrs nil, :content nil} {:tag :date_added, :attrs nil, :content ["Fri Jul 09 13:29:58 -0700 2010"]} {:tag :date_updated, :attrs nil, :content ["Fri Jul 09 14:08:18 -0700 2010"]} {:tag :read_count, :attrs nil, :content nil} {:tag :body, :attrs nil, :content ["This is a really high three for me. I consider this book to be an essential reference. If you are a working programmer or a Computer Science student this book must be on your book self. It has excellent descriptions with great diagrams. It also not only covers the basics, but at the end of each sect...<a href=\"http://www.goodreads.com/review/show/110833399\">more...</a>"]} {:tag :comments_count, :attrs nil, :content ["0"]} {:tag :url, :attrs nil, :content ["http://www.goodreads.com/review/show/110833399"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/review/show/110833399"]}]} {:tag :review, :attrs nil, :content [{:tag :id, :attrs nil, :content ["110723326"]} {:tag :book, :attrs nil, :content [{:tag :id, :attrs {:type "integer"}, :content ["6097506"]} {:tag :isbn, :attrs nil, :content ["1933988932"]} {:tag :isbn13, :attrs nil, :content ["9781933988931"]} {:tag :text_reviews_count, :attrs {:type "integer"}, :content ["2"]} {:tag :title, :attrs nil, :content ["\n    Grails in Action\n  "]} {:tag :image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1266508012m/6097506.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1266508012s/6097506.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/book/show/6097506-grails-in-action"]} {:tag :average_rating, :attrs nil, :content ["3.89"]} {:tag :ratings_count, :attrs nil, :content ["9"]} {:tag :description, :attrs nil, :content nil} {:tag :authors, :attrs nil, :content [{:tag :author, :attrs nil, :content [{:tag :id, :attrs nil, :content ["1093634"]} {:tag :name, :attrs nil, :content ["Glen Smith"]} {:tag :image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-U-200x266.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-U-50x66.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/author/show/1093634.Glen_Smith"]} {:tag :average_rating, :attrs nil, :content ["4.00"]} {:tag :ratings_count, :attrs nil, :content ["10"]} {:tag :text_reviews_count, :attrs nil, :content ["2"]}]}]} {:tag :published, :attrs nil, :content ["2009"]}]} {:tag :rating, :attrs nil, :content ["4"]} {:tag :votes, :attrs nil, :content ["0"]} {:tag :spoiler_flag, :attrs nil, :content ["false"]} {:tag :shelves, :attrs nil, :content [{:tag :shelf, :attrs {:name "read"}, :content nil} {:tag :shelf, :attrs {:name "highly-recommended"}, :content nil}]} {:tag :recommended_for, :attrs nil, :content nil} {:tag :recommended_by, :attrs nil, :content nil} {:tag :started_at, :attrs nil, :content ["Mon Feb 01 00:00:00 -0800 2010"]} {:tag :read_at, :attrs nil, :content nil} {:tag :date_added, :attrs nil, :content ["Thu Jul 08 21:05:32 -0700 2010"]} {:tag :date_updated, :attrs nil, :content ["Fri Jul 09 14:08:32 -0700 2010"]} {:tag :read_count, :attrs nil, :content nil} {:tag :body, :attrs nil, :content ["Surprisingly good. This book did a good job explaining grails and even more important making be excited to program in it. I highly recommend this book."]} {:tag :comments_count, :attrs nil, :content ["0"]} {:tag :url, :attrs nil, :content ["http://www.goodreads.com/review/show/110723326"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/review/show/110723326"]}]} {:tag :review, :attrs nil, :content [{:tag :id, :attrs nil, :content ["110720324"]} {:tag :book, :attrs nil, :content [{:tag :id, :attrs {:type "integer"}, :content ["105099"]} {:tag :isbn, :attrs nil, :content ["0201310058"]} {:tag :isbn13, :attrs nil, :content ["9780201310054"]} {:tag :text_reviews_count, :attrs {:type "integer"}, :content ["26"]} {:tag :title, :attrs nil, :content ["\n    Effective Java Programming Language Guide\n  "]} {:tag :image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1171537453m/105099.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1171537453s/105099.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/book/show/105099.Effective_Java_Programming_Language_Guide"]} {:tag :average_rating, :attrs nil, :content ["4.38"]} {:tag :ratings_count, :attrs nil, :content ["175"]} {:tag :description, :attrs nil, :content ["\n    Written for the working Java developer, Joshua Bloch's  <em>Effective Java Programming Language Guide</em> provides a truly  useful set of over 50 best practices and tips for writing better Java  code. With plenty of advice from an indisputable expert in the field,  this title is sure to be an indispensable resource for anyone who wants  to get more out of their code.<p>As a veteran developer at Sun, the  author shares his considerable insight into the design choices made  over the years in Sun's own Java libraries (which the author  acknowledges haven't always been perfect). Based on his experience  working with Sun's best minds, the author provides a compilation of 57  tips for better Java code organized by category. Many of these ideas  will let you write more robust classes that better cooperate with  built-in Java APIs. Many of the tips make use of software patterns and  demonstrate an up-to-the-minute sense of what works best in today's  design. Each tip is clearly introduced and explained with code snippets  used to demonstrate each programming principle.<p>Early sections on  creating and destroying objects show you ways to make better use of  resources, including how to avoid duplicate objects. Next comes an  absolutely indispensable guide to implementing &quot;required&quot; methods for  custom classes. This material will help you write new classes that  cooperate with old ones (with advice on implementing essential  requirements like the <em>equals()</em> and <em>hashCode()</em>  methods).<p>The author has a lot to say about class design, whether  using inheritance or composition. Tips on designing methods show you  how to create understandable, maintainable, and robust classes that can  be easily reused by others on your team. Sections on mapping C code  (like structures, unions, and enumerated types) onto Java will help C  programmers bring their existing skills to Sun's new language. Later  sections delve into some general programming tips, like using  exceptions effectively. The book closes with advice on using threads  and synchronization techniques, plus some worthwhile advice on object  serialization.<p>Whatever your level of Java knowledge, this title can  make you a more effective programmer. Wisely written, yet never pompous  or doctrinaire, the author has succeeded in packaging some really  valuable nuggets of advice into a concise and very accessible guidebook  that arguably deserves a place on most any developer's bookshelf.  <em>--Richard Dragan</em> <p> <strong>Topics covered:</strong> &lt;ul&gt; &lt;li&gt;Best practices and tips for Java &lt;li&gt;Creating and destroying objects (static factory methods,  singletons, avoiding duplicate objects and finalizers) &lt;li&gt;Required methods for custom classes (overriding <em>equals()</em>,  <em>hashCode()</em>, <em>toString()</em>, <em>clone()</em>, and  <em>compareTo()</em> properly) &lt;li&gt;Hints for class and interface design (minimizing class and member  accessibility, immutability, composition versus inheritance, interfaces  versus abstract classes, preventing subclassing, static versus  nonstatic classes) &lt;li&gt;C constructs in Java (structures, unions, enumerated types, and  function pointers in Java) &lt;li&gt;Tips for designing methods (parameter validation, defensive copies,  method signatures, method overloading, zero-length arrays, hints for  Javadoc comments) &lt;li&gt;General programming advice (local variable scope, using Java API  libraries, avoiding <em>float</em> and <em>double</em> for exact  comparisons, when to avoid strings, string concatenation, interfaces  and reflection, avoid native methods, optimizing hints, naming  conventions) &lt;li&gt;Programming with exceptions (checked versus run-time exceptions,  standard exceptions, documenting exceptions, failure-capture  information, failure atomicity) &lt;li&gt;Threading and multitasking (synchronization and scheduling hints,  thread safety, avoiding thread groups) &lt;li&gt;Serialization (when to implement <em>Serializable</em>, the  <em>readObject()</em>, and <em>readResolve()</em> methods) </p></p></p></p></p>\n  "]} {:tag :authors, :attrs nil, :content [{:tag :author, :attrs nil, :content [{:tag :id, :attrs nil, :content ["60805"]} {:tag :name, :attrs nil, :content ["Joshua Bloch"]} {:tag :image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-U-200x266.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-U-50x66.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/author/show/60805.Joshua_Bloch"]} {:tag :average_rating, :attrs nil, :content ["4.38"]} {:tag :ratings_count, :attrs nil, :content ["249"]} {:tag :text_reviews_count, :attrs nil, :content ["52"]}]}]} {:tag :published, :attrs nil, :content ["2001"]}]} {:tag :rating, :attrs nil, :content ["4"]} {:tag :votes, :attrs nil, :content ["0"]} {:tag :spoiler_flag, :attrs nil, :content ["false"]} {:tag :shelves, :attrs nil, :content [{:tag :shelf, :attrs {:name "read"}, :content nil} {:tag :shelf, :attrs {:name "highly-recommended"}, :content nil}]} {:tag :recommended_for, :attrs nil, :content nil} {:tag :recommended_by, :attrs nil, :content nil} {:tag :started_at, :attrs nil, :content ["Sat Dec 01 00:00:00 -0800 2007"]} {:tag :read_at, :attrs nil, :content nil} {:tag :date_added, :attrs nil, :content ["Thu Jul 08 20:44:14 -0700 2010"]} {:tag :date_updated, :attrs nil, :content ["Fri Jul 09 14:08:49 -0700 2010"]} {:tag :read_count, :attrs nil, :content nil} {:tag :body, :attrs nil, :content ["If you program Java, you must read this book. You won't learn any new syntax, language feature, library, or framework, but you will be a much better programmer as a result of reading this book. Its the best anything on Java I have read. I don't agree with 100% of the material in this book, but Joshu...<a href=\"http://www.goodreads.com/review/show/110720324\">more...</a>"]} {:tag :comments_count, :attrs nil, :content ["0"]} {:tag :url, :attrs nil, :content ["http://www.goodreads.com/review/show/110720324"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/review/show/110720324"]}]} {:tag :review, :attrs nil, :content [{:tag :id, :attrs nil, :content ["110719511"]} {:tag :book, :attrs nil, :content [{:tag :id, :attrs {:type "integer"}, :content ["41801"]} {:tag :isbn, :attrs nil, :content ["0133708756"]} {:tag :isbn13, :attrs nil, :content ["9780133708752"]} {:tag :text_reviews_count, :attrs {:type "integer"}, :content ["7"]} {:tag :title, :attrs nil, :content ["\n    ANSI Common LISP\n  "]} {:tag :image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1169755452m/41801.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1169755452s/41801.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/book/show/41801.ANSI_Common_LISP"]} {:tag :average_rating, :attrs nil, :content ["4.07"]} {:tag :ratings_count, :attrs nil, :content ["57"]} {:tag :description, :attrs nil, :content ["\n    This book provides an excellent introduction to Common Lisp. In addition to chapters covering  the basic language concepts, there are sections discussing the Common Lisp object system (CLOS) and  speed considerations in Lisp. Three fair-sized examples of nontrivial Lisp projects are also included. The  book's clear and engaging format explains complicated constructs simply. This format makes <em>ANSI  Common Lisp</em> accessible to a general audience--even those who have never programmed before. The  book also provides an excellent perspective on the value of using Lisp. \n  "]} {:tag :authors, :attrs nil, :content [{:tag :author, :attrs nil, :content [{:tag :id, :attrs nil, :content ["23551"]} {:tag :name, :attrs nil, :content ["Paul Graham"]} {:tag :image_url, :attrs nil, :content ["http://photo.goodreads.com/authors/1235405249p5/23551.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://photo.goodreads.com/authors/1235405249p2/23551.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/author/show/23551.Paul_Graham"]} {:tag :average_rating, :attrs nil, :content ["4.10"]} {:tag :ratings_count, :attrs nil, :content ["388"]} {:tag :text_reviews_count, :attrs nil, :content ["43"]}]}]} {:tag :published, :attrs nil, :content ["1995"]}]} {:tag :rating, :attrs nil, :content ["4"]} {:tag :votes, :attrs nil, :content ["0"]} {:tag :spoiler_flag, :attrs nil, :content ["false"]} {:tag :shelves, :attrs nil, :content [{:tag :shelf, :attrs {:name "read"}, :content nil} {:tag :shelf, :attrs {:name "highly-recommended"}, :content nil}]} {:tag :recommended_for, :attrs nil, :content nil} {:tag :recommended_by, :attrs nil, :content nil} {:tag :started_at, :attrs nil, :content nil} {:tag :read_at, :attrs nil, :content nil} {:tag :date_added, :attrs nil, :content ["Thu Jul 08 20:38:27 -0700 2010"]} {:tag :date_updated, :attrs nil, :content ["Fri Jul 09 14:09:03 -0700 2010"]} {:tag :read_count, :attrs nil, :content nil} {:tag :body, :attrs nil, :content nil} {:tag :comments_count, :attrs nil, :content ["0"]} {:tag :url, :attrs nil, :content ["http://www.goodreads.com/review/show/110719511"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/review/show/110719511"]}]} {:tag :review, :attrs nil, :content [{:tag :id, :attrs nil, :content ["110703343"]} {:tag :book, :attrs nil, :content [{:tag :id, :attrs {:type "integer"}, :content ["43713"]} {:tag :isbn, :attrs nil, :content ["0262510871"]} {:tag :isbn13, :attrs nil, :content ["9780262510875"]} {:tag :text_reviews_count, :attrs {:type "integer"}, :content ["18"]} {:tag :title, :attrs nil, :content ["\n    Structure and Interpretation of Computer Programs - 2nd Edition\n  "]} {:tag :image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1170211338m/43713.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://photo.goodreads.com/books/1170211338s/43713.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/book/show/43713.Structure_and_Interpretation_of_Computer_Programs_2nd_Edition"]} {:tag :average_rating, :attrs nil, :content ["4.61"]} {:tag :ratings_count, :attrs nil, :content ["123"]} {:tag :description, :attrs nil, :content ["\n    Abelson and Sussman's classic <em>Structure and Interpretation of Computer Programs</em> teaches readers how to program by employing the tools of abstraction and modularity. The authors' central philosophy is that programming is the task of breaking large problems into small ones. The book spends a great deal of time considering both this decomposition and the process of knitting the smaller pieces back together.<p> The authors employ this philosophy in their writing technique. The text asks the broad question &quot;What is programming?&quot; Having come to the conclusion that programming consists of procedures and data, the authors set off to explore the related questions of &quot;What is data?&quot; and &quot;What is a procedure?&quot;<p> The authors build up the simple notion of a procedure to dizzying complexity. The discussion culminates in the description of the code behind the programming language Scheme. The authors finish with examples of how to implement some of the book's concepts on a register machine. Through this journey, the reader not only learns how to program, but also how to think about programming.</p></p>\n  "]} {:tag :authors, :attrs nil, :content [{:tag :author, :attrs nil, :content [{:tag :id, :attrs nil, :content ["24590"]} {:tag :name, :attrs nil, :content ["Harold Abelson"]} {:tag :image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-U-200x266.jpg"]} {:tag :small_image_url, :attrs nil, :content ["http://www.goodreads.com/images/nophoto/nophoto-U-50x66.jpg"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/author/show/24590.Harold_Abelson"]} {:tag :average_rating, :attrs nil, :content ["4.59"]} {:tag :ratings_count, :attrs nil, :content ["129"]} {:tag :text_reviews_count, :attrs nil, :content ["22"]}]}]} {:tag :published, :attrs nil, :content ["1996"]}]} {:tag :rating, :attrs nil, :content ["5"]} {:tag :votes, :attrs nil, :content ["0"]} {:tag :spoiler_flag, :attrs nil, :content ["false"]} {:tag :shelves, :attrs nil, :content [{:tag :shelf, :attrs {:name "read"}, :content nil} {:tag :shelf, :attrs {:name "highly-recommended"}, :content nil}]} {:tag :recommended_for, :attrs nil, :content ["Anyone"]} {:tag :recommended_by, :attrs nil, :content nil} {:tag :started_at, :attrs nil, :content ["Wed Aug 01 00:00:00 -0700 2001"]} {:tag :read_at, :attrs nil, :content nil} {:tag :date_added, :attrs nil, :content ["Thu Jul 08 19:01:18 -0700 2010"]} {:tag :date_updated, :attrs nil, :content ["Fri Jul 09 14:09:23 -0700 2010"]} {:tag :read_count, :attrs nil, :content ["Dozens"]} {:tag :body, :attrs nil, :content nil} {:tag :comments_count, :attrs nil, :content ["0"]} {:tag :url, :attrs nil, :content ["http://www.goodreads.com/review/show/110703343"]} {:tag :link, :attrs nil, :content ["http://www.goodreads.com/review/show/110703343"]}]}]}]})

(deftest test-review-parsing
  (let [reviews (extract-reviews raw-list-response)]
    (is (= 5 (count reviews)))
    (is (= "5" (:rating (first reviews))))))


