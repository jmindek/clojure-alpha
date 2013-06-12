(ns yahtzee.core
  (:gen-class))

(comment
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Play yahtzee")))

(defn chance [numbers]
	(reduce + numbers))

(defn yahtzee [numbers]
	(if (zero? (reduce (fn [a b] (if (= a b) a 0)) numbers)) 
		0 
		50))

(defn units [u numbers]
	(reduce + (filter #(= u %1) numbers)))

(defn pair [numbers]
	(reduce + (filter #(= %1) (sort numbers))))