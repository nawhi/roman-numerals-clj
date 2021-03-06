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
                        10 "X"
                        11 "XI"
                        39 "XXXIX"
                        40 "XL"
                        50 "L"
                        90 "XC"
                        100 "C"
                        400 "CD"
                        500 "D"
                        900 "CM"
                        1000 "M"
                        1994 "MCMXCIV"
                        2021 "MMXXI"

                        )))
