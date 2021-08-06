(ns roman-numerals.core
  (:require [clojure.string :as str]))

(defn roman-numeral
  "Convert a number to its equivalent in Roman Numerals"
  [n]
  (cond
    (= n 4) "IV"
    (= n 5) "V"
    (= n 9) "IX"
    (> n 9) (str "X" (roman-numeral (- n 10)))
    (> n 5) (str "V" (roman-numeral (- n 5)))
    (< n 4) (str/join (repeat n "I"))
    ))
