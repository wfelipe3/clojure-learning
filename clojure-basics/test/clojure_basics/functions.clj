(ns clojure-basics.functions
  (:require [clojure.test :refer :all]
            [clojure-basics.core :refer :all]))

(def hello-with-name (fn [] "hello"))

(defn hello
  ([] (hello "test"))
  ([name] (str "hello" " " name))
  ([name other] (str "hello" " " name " " other)))

(deftest test-function
  (testing "anonymous function"
    (is (= "hello" ((fn [] "hello"))))
    (is (= "hello" (#(str "hello")))))
  (testing "function with name"
    (is (= "hello" (hello-with-name))))
  (testing "first function"
    (is (= "hello test" (hello)))
    (is (= "hello felipe" (hello "felipe")))
    (is (= "hello felipe rojas" (hello "felipe" "rojas")))))
