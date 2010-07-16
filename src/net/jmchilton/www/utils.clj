(ns net.jmchilton.www.utils
  (:require [clojure.contrib.string :as string]))

(def as-str string/as-str)

(def join string/join)

(defn as-int 
  ([x] (as-int x 10)) 
  ([x radix]
    (Integer/parseInt (as-str x) radix)))

(defn current-time [] (.getTime (new java.util.Date)))

(defn constant [x] (fn [& args] x)) ; cannot do this with # lambdas as far I can tell.

(defn parse-date-str [date-str date-format]
	(let [cal (java.util.Calendar/getInstance)]
	  (.setTime cal (org.apache.commons.lang.time.DateUtils/parseDate date-str (into-array [date-format])))
	  cal))
