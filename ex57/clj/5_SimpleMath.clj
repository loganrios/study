(println "What is the first number?")
(def first-num (Integer/parseInt (read-line)))
(def second-num (Integer/parseInt (read-line)))

(defn printop! [op x y]
  (println x op y "=" (op x y)))

(printop! + first-num second-num)
(printop! - first-num second-num)
(printop! * first-num second-num)
(printop! / first-num second-num)

;; lol this more or less works though the output is ugly
