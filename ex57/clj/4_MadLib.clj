
(defn get-f [type]
  (println (str "Enter " type ": "))
  (read-line))

(println "Do you" (get-f "a verb") "your" (get-f "an adjective") (get-f "a noun")
         (get-f "an adverb") "? That's hilarious!")
