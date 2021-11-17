(defn line-getter
  "Takes a message and returns a string from STDIN."
  [msg]
  (println msg)
  (read-line))

(defn num-getter [msg] (Integer/parseInt (line-getter msg)))
(def age (num-getter "What is your current age?"))
(def retirement-age (num-getter "At what age would you like to retire?"))
(def years-left (- retirement-age age))
(println "You have" years-left "years until you can retire.")
(def now (java.time.LocalDateTime/now))
(def year (. now getYear))
(println "It is" year ", so you can retire in" (+ year years-left))

;; oh my god that was hard
