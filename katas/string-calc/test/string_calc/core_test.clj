(ns string-calc.core-test
  (:use clojure.test
        string-calc.core))

(deftest empty-str-test
	(testing "#return 0 for empty string.")
	(is (= 0 (add ""))))

(deftest str-with-1-num-test
	(testing "return function argument when single argument received")
	(is (= 1 (add "1"))))

(deftest str-with-2-num-test
	(testing "returns sum of individual nums in string")
	(is (= 2 (add "1,1"))))

(deftest str-with-6-num-test
	(testing "returns sum of individual nums in string")
	(is (= 6 (add "1,1,1,1,1,1"))))

(deftest str-with-newline-delim-num-test
	(testing "returns sum of individual nums in string delimited by newline")
	(is (= 3 (add "1\n1\n1"))))

'(deftest add-set-delim-test
'	(testing "determine delimeter based on string then add")
'	(is (= 3 (add "//;\n1;1;1"))))

(deftest neg-ex-test
	(testing "should return excpetion message for negitive number")
	(is (= "Negitives not allowed: -1" (neg-ex -1))))

(comment
(deftest str-with-negitive-num-test
	(testing "returns exception Negitives not allowed and displays the negitive numbers")
	(is (= "Negitives not allowed: -1" (add "1\n-1\n1"))))
)

