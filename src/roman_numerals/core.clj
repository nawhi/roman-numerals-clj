(ns roman-numerals.core
  (:require [clojure.string :as str]))

(defn roman-numeral
  "Convert a number to its equivalent in Roman Numerals"
  [n]
  (cond
    (< n 4) (str/join (repeat n "I"))
    (= n 4) "IV"
    (= n 5) "V"))
