(defn line-getter
  "Takes a message and returns a string from STDIN."
  [msg]
  (println msg)
  (read-line))

(defn num-getter [msg] (Integer/parseInt (line-getter msg)))
(def length (num-getter "What is the length of the room in feet?"))
(def width (num-getter "What is the width of the room in feet?"))
(println "You entered dimensions of" length "feet by" width "feet.")
(def areaft (* width length))
(println "The area is" areaft "square feet")
(println "The area is" (* areaft 0.09290304) "square feet")
