(ns yahtzee.core-spec
  (:require [speclj.core :refer :all]
            [yahtzee.core :refer :all]))

(comment
(describe "Add function"
	;(before (println "Running spec for the add function."))
	;(after (println "Finished spec for the add function."))
	;(before-all (println "Running specs for the add function."))
	;(after-all (println "Finished specs for the add function."))
	(it "returns 0 for the empty string"
  		(should= 0 (add empty-str))))
)

(describe "yahtzee categories"
	;(before (println "Running spec for the add function."))
	;(after (println "Finished spec for the add function."))
	;(before-all (println "Running specs for the add function."))
	;(after-all (println "Finished specs for the add function."))
	(it "chance should be sum of the dice"
  		(should= 14 (chance '(1 1 3 3 6))))

	(it "yahtzee should 50 if all match"
		(should= 50 (yahtzee '(1 1 1 1 1))))

	(it "yahtzee should 0 if not all match"
		(should= 0 (yahtzee '(1 3 1 1 1))))

	(it "sum of the values that match the category"
		(should= 4 (units 1 '(1 3 1 1 1))))

	(it "units - sum of the values that match the category"
		(should= 6 (units 3 '(1 3 1 2 3))))

	(it "0 if values that don't match the category"
		(should= 0 (units 5 '(1 3 1 2 3))))

	(it "pair - sum the two highest matching dice"
		(should= 6 (pair '(1 3 1 2 3))))
	)
