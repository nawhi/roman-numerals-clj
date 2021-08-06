(ns roman-numerals.core
  (:require [clojure.string :as str]))

(defn roman-numeral
  "Convert a number to its equivalent in Roman Numerals"
  [n]
  (cond
    (= n 4) "IV"
    (= n 5) "V"
    (= n 9) "IX"
    (> n 99) (str "C" (roman-numeral (- n 100)))
    (> n 49) (str "L" (roman-numeral (- n 50)))
    (> n 39) (str "XL" (roman-numeral (- n 40)))
    (> n 9) (str "X" (roman-numeral (- n 10)))
    (> n 5) (str "V" (roman-numeral (- n 5)))
    (< n 4) (str/join (repeat n "I"))
    ))
