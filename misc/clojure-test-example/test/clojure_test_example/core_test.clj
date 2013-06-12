(ns clojure-test-example.core-test
  (:use clojure.test
        clojure-test-example.core))

(deftest some-tests
  (testing "true and 0 are not the same"
    (is (= 0 1)))

  (testing "nil and [] are not the same"
    (is (nil? []))))

