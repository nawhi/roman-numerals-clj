(ns roman-numerals.core (:require [clojure.string :as str]))

(defn roman-numeral
  "Convert a number to its equivalent in Roman Numerals"
  [n]
  (str/join (repeat n "I")))
