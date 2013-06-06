(ns string-calc.core
  (:gen-class))

(declare neg-ex)

(defn add 
  "add 0,1,2 number strings"
  [num-string]
  (if (empty? num-string)
    0
    (reduce + (map #(. Integer parseInt %) (re-seq #"\d" num-string)))
    ;(map neg-ex (map #(. Integer parseInt %) (re-seq #"\d" num-string)))
    ))

(defn neg-ex 
	"Returns an exception if the number is negitive."
	[num]
	(if (neg? num)
		(str "Negitives not allowed: " num)))

'(reduce + (map #(. Integer parseInt %) (re-seq #"\d" num-string)))