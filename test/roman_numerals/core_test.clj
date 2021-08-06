(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest roman-numerals.core-test
  (testing
    (are [num expected] (= expected (roman-numeral num))
                        1 "I"
                        2 "II"
                        3 "III"
                        4 "IV"
                        5 "V"
                        6 "VI"
                        7 "VII"
                        8 "VIII"
                        9 "IX"
                        10 "X")))
