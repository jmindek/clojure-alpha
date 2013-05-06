(ns project-euler)

(defn problem-1
	(reduce + (map mult-of-3-or-5 (range 1000))))
	
(defn mult-of-3-or-5 [num]
	(cond
		(zero? (rem num 3))
			(+ num 0)
		(zero? (rem num 5))
			(+ num 0)
		:else (+ 0 0)))
