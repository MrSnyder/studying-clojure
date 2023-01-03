(ns seven-languages.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn big 
  [st n] (> (count st) n))

(big "HUHU" 4)

(defn collection-type
  [col] 
  (if (instance? col lojure.lang.PersistentList) :list 
      (if (= (class col) clojure.lang.PersistentArrayMap) :map 
          (if (= (class col) clojure.lang.PersistentVector) :vector :other))))

(collection-type '())
(collection-type '(1 2 3))
(collection-type {:a 1 :b 2 :c 3})
(collection-type {:a 1 :b 2 :c 3})

('(123))