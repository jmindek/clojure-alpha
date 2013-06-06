(ns yahtzee.speclj.core-spec
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

(describe "yahtzee chance 1"
	;(before (println "Running spec for the add function."))
	;(after (println "Finished spec for the add function."))
	;(before-all (println "Running specs for the add function."))
	;(after-all (println "Finished specs for the add function."))
	(it "chance should be 5 for all 1's"
  		(should= 5 (chance '(1 1 1 1 1))))

	(it "yahtzee should 50 if all match"
		(should= 50 (yahtzee '(1 1 1 1 1)))))
