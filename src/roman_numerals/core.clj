(ns roman-numerals.core
  (:require [clojure.string :as str]))

(def RAW-NUMERALS {'1   "I",
                   '4   "IV",
                   '5   "V",
                   '9   "IX",
                   '10  "X",
                   '40  "XL",
                   '50  "L",
                   '90  "XC",
                   '100 "C"
                   '400 "CD"
                   '500 "D"
                   '900 "CM"
                   '1000 "M"})
(def NUMERALS (into (sorted-map-by >) RAW-NUMERALS))

(defn roman-numeral
  "Convert a number to its Roman Numeral equivalent"
  [n]
  (loop
    [n n result ""]
    (if (zero? n)
      result
      (let [entry (filter (fn [[number roman]] (>= n number)) NUMERALS)
            [[number roman]] entry]
        (recur (- n number) (str result roman))))))
