(ns yahtzee.core
  (:gen-class))

(comment
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")))

(defn chance [numbers]
	(reduce + numbers))

(defn yahtzee [numbers]
	(if (zero? (reduce (fn [a b] (if (= a b) a 0)) numbers)) 
		0 
		50))
