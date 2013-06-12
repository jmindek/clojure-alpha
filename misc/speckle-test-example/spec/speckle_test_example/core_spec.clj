(ns speckle-test-example.core-spec
  (:require [speclj.core :refer :all]
            [speckle-test-example.core :refer :all]))

(describe "a trivial test"
  (it "zero should not equal 1"
    (should= 0 1)))

(describe "some tests"
  (it "0 should not equal 0"
    (should-not= 0 0))

  (it "The hash should contain the key :id."
    (should-contain :id {:name "Gary Gygax" :id 1 :role "game designer"})))
