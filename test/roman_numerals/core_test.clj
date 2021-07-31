(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest roman-numerals.core-test
  (testing
    (are [num expected] (= expected (roman-numeral num))
                        1 "I"
                        2 "II"
                        3 "III"
                        4 "IV")))
