(ns roman-numerals.core
  (:require [clojure.string :as str]))

(def NUMERALS {:4   "IV"
               :5   "V"
               :9   "IX"
               :10  "X"
               :40  "XL"
               :50  "L"
               :90  "XC"
               :100 "C"})

(defn roman-numeral
  "Convert a number to its Roman Numeral equivalent"
  [n]
  (cond
    (>= n 100) (str "C" (roman-numeral (- n 100)))
    (>= n 90) (str "XC" (roman-numeral (- n 100)))
    (>= n 50) (str "L" (roman-numeral (- n 50)))
    (>= n 40) (str "XL" (roman-numeral (- n 40)))
    (>= n 10) (str "X" (roman-numeral (- n 10)))
    (>= n 9) (str "IX" (roman-numeral (- n 9)))
    (>= n 5) (str "V" (roman-numeral (- n 5)))
    (>= n 4) (str "IV" (roman-numeral (- n 5)))
    :else (str/join (repeat n "I"))
    ))
