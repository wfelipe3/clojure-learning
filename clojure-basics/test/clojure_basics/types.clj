
(ns clojure-basics.types
  (:require [clojure.test :refer :all]
            [clojure-basics.core :refer :all]))

(deftest testing-types
  (testing "show clojure types"
    (is (= java.lang.Long (type 1)))
    (is (= java.lang.Double (type 1.1)))
    (is (= java.lang.Boolean (type true)))
    (is (= java.lang.String (type "test")))
    (is (= clojure.lang.Keyword (type (keyword "a"))))
    (is (= clojure.lang.Keyword (type :a)))
    (is (= clojure.lang.Symbol (type 'a)))
    (is (= clojure.lang.Symbol (type (quote a))))
    (is (= clojure.lang.PersistentList (type (list 1 2 3))))
    (is (= clojure.lang.PersistentVector (type (vector 1 2 3))))
    (is (= clojure.lang.PersistentVector (type [1 2 3])))
    (is (= clojure.lang.PersistentArrayMap (type {:a 1 :b 2 :c 3})))
    (is (= clojure.lang.PersistentHashMap (type (hash-map :a 1 :b 2 :c 3))))
    (is (= clojure.lang.PersistentHashSet (type #{1 2 3})))
    (is (= clojure.lang.PersistentHashSet (type (hash-set 1 2 3))))))

(deftest map-values
  (testing "get value from map"
    (is (= 1 (:a {:a 1})))))
