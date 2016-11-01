(ns project_euler.t-core
  (:use midje.sweet)
  (:use [project_euler.core]))

;;; Problem 1
(facts "about multiples-of"
  (fact "given two factors and a number it returns all multiples of the factors of the number"
    (multiples-of 1 2 4) => '(0 1 2 3)
    (multiples-of 2 3 4) => '(0 2 3))
)

(facts "about prob1"
  (fact "it should return the sum of the multiples of the factors 3 & 5 in 1000"
    prob1 => 233168))


;;; Problem 2
(facts "about fib"
  (fact "it should return a lazy seq"
    (type (fib 1 1))=> clojure.lang.Cons)
  (fact "it should return a seq of fib numbers given a starting point"
    (take 7 (fib 1 1))=> '(1 1 2 3 5 8 13))
  )

(facts "about prob2"
  (fact "it should return a seq of fib numbers upto 4 Million"
    prob2 => 4613732))

;;; Problem 3
(facts "about prob3"
  (fact "it should find the largest prime factor of 600851475143"
    prob3 => 6857))

(facts "about prime-factors"
  (fact "it should return prime factors of a number"
    (prime-factors 1) => []
    (prime-factors 2) => [2]
    (prime-factors 3) => [3]
    (prime-factors 4) => [2 2]
    (prime-factors 5) => [5]
    (prime-factors 6) => [2 3]
    (prime-factors 7) => [7]
    (prime-factors 8) => [2 2 2]
    (prime-factors 9) => [3 3]
    ))


;;; Problem 4
(facts "about prob4"
  (fact "it should return the largest palidrome from the prodcut of two 3 digit numbers"
    prob4 => 906609))

(facts "about palindrome?"
  (fact "it should return true if passed a palindrome string"
    (palindrome? "tit") => true
    (palindrome? "12222221") => true)
  (fact "it should return false if passed a non palindrome string"
    (palindrome? "git") => false
    (palindrome? "1234") => false)
  (fact "it should return true if passed a palindrome number"
    (palindrome? 12321) => true)
  (fact "it should return false if passed a non palindrome number"
    (palindrome? 123445) => false))

(facts "about largest-palindrome"
  (fact "given a number it should return the largest palindrome less than it."
    (largest-palindrome 100) => 99
    (largest-palindrome 398) => 393
    (largest-palindrome (* 999 999)) => 997799))



;;; Problem 5

(facts "about least-common-multiple"
  (fact "given a range of numbers it finds the LCM"
    (reduce #(lcm %1 %2) (range 1 11)) => 2520
    (reduce #(lcm %1 %2) (range 1 21)) => 232792560))

(facts "about prob5"
  (fact "given a range of numbers it finds the LCM"
    prob5 => 232792560))


;;; Problem6
(facts "about prob6"
  (fact "it should work out the square of the sum less the sum 
    of the sqaures for a given range of numbers"
    prob6 => 25164150))
