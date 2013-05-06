(ns addition)

;write a recusive function to add numbers
(defn add-nums-recursively [x & more]
  (let [y (first more) z (rest more)]
  (if (zero? (count z))
    (+ x y)
    (recur (+ x y) z))))