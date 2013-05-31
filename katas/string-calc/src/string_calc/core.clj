(ns string-calc.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn add 
  "add 0,1,2 number strings"
  [num-string]
  (if (empty? num-string)
    0
    (reduce + (map #(. Integer parseInt %) (re-seq #"\d" num-string)))))