(ns str-calc-speclj.core
  (:gen-class))

(defn sum-nums [num-str]
	(reduce + (map #(. Integer parseInt %) (re-seq #"\d" num-str))))

(defn add [num-str]
	(if (empty? num-str)
		0
		(sum-nums num-str)))

