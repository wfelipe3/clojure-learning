(ns clojure-basics.flow-control
  (:require [clojure.test :refer :all]
            [clojure-basics.core :refer :all]))

(def x "hello world")

(deftest flow-control
  (testing "variable statement"
    (is (= "hello world" x)))
  (testing "let statement"
    (let [hi "hello"]
      (is (= "hello" hi))))
  (testing "if statement"
    (is (= "not empty" (if (empty? x)
                         "empty"
                         "not empty"))))
  (testing "do statement"
    (is (= :ok (if-not (empty? x) 
                 (do (println "ok")
                   :ok)
                 nil)))))
