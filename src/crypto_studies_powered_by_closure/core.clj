(ns crypto-studies-powered-by-closure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn caesar
  ([string] (printf "Normal caesar (%s), with %s" string "3"))
  ([string base] (printf "Changed base (%s), with %s" string base)))