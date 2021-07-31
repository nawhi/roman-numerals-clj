(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest roman-numerals.core-test
  (testing "FIXME, I fail."
    (are [num expected] (= (roman-numeral num) expected)
                        1 "I")))
