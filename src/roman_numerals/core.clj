(ns roman-numerals.core
  (:require [clojure.string :as str]))

(defn roman-numeral
  "Convert a number to its equivalent in Roman Numerals"
  [n]
  (cond
    (>= n 100) (str "C" (roman-numeral (- n 100)))
    (>= n 50) (str "L" (roman-numeral (- n 50)))
    (>= n 40) (str "XL" (roman-numeral (- n 40)))
    (>= n 10) (str "X" (roman-numeral (- n 10)))
    (= n 9) (str "IX" (roman-numeral (- n 9)))
    (>= n 5) (str "V" (roman-numeral (- n 5)))
    (>= n 4) (str "IV" (roman-numeral (- n 5)))
    :else (str/join (repeat n "I"))
    ))
