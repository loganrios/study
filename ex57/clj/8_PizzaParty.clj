;; at this point I should start making my own stdlib lmao
(defn line-getter
  "Takes a message and returns a string from STDIN."
  [msg]
  (println msg)
  (read-line))

(defn num-getter [msg] (Integer/parseInt (line-getter msg)))

;; actual program
(def people (num-getter "How many people?"))
(def pizzas (num-getter "How many pizzas do you have?"))
(println people "people with" pizzas "pizzas.")
(def slices (* 8 pizzas))
(def slices-per (quot slices people))
(println "Each person gets" slices-per "pieces of pizza.")
(println "There are" (mod slices people) "leftover pieces.")
