(ns str-calc-speclj.core-spec
  (:require [speclj.core :refer :all]
            [str-calc-speclj.core :refer :all]))

(def empty-str "")
(def single-num-str "5")
(def two-num-str "3,2")
(def multi-num-str "1,1,1,1,1")
(def two-num-w-newline-str "3\n2")
(describe "Add function"

	(it "returns 0 for the empty string"
  		(should= 0 (add empty-str)))

	(it "returns the number for a string of one number"
		(should= 5 (add single-num-str)))

	(it "returns the sum of numbers for a string of two"
		(should= 5 (add two-num-str)))

	(it "returns the sum of numbers for a string of length > 2"
		(should= 5 (add multi-num-str)))

	(it "Newlines should not interupt summing the numbers"
		(should= 5 (add two-num-w-newline-str))))

