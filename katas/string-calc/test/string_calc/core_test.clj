(ns string-calc.core-test
  (:use clojure.test
        string-calc.core))

'(deftest a-test
'  (testing "FIXME, I fail."
'    (is (= 0 1))))

(deftest add-return-0-for-empty-str-test
	(testing "#add function does not return 0 for empty string.")
	(is (= 0 (add ""))))

(deftest add-return-num-for-str-with-1-num-test
	(testing "add function returns function argument when single argument received")
	(is (= 1 (add "1"))))

(deftest add-return-num-for-str-with-2-num-test
	(testing "add function returns sum of individual nums in string")
	(is (= 2 (add "11"))))

(deftest add-return-num-for-str-with-6-num-test
	(testing "add function returns sum of individual nums in string")
	(is (= 6 (add "111111"))))