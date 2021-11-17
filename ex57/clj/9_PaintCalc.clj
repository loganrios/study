(defn line-getter
  "Takes a message and returns a string from STDIN."
  [msg]
  (println msg)
  (read-line))

(defn num-getter [msg] (Integer/parseInt (line-getter msg)))
(def length (num-getter "What is the length of the room in feet?"))
(def width (num-getter "What is the width of the room in feet?"))
(def area (* length width))

(defn get-buckets
  "Get the amount of paint buckets required
  to paint a given rectangular room's area entirely."
  [area]
  (let [gallons-in-bucket 350
        buckets (quot area gallons-in-bucket)]
    (if (>= (* gallons-in-bucket buckets) area)
      buckets
      (+ buckets 1))))

(println "You will need to purchase" (get-buckets area) "gallons of paint to cover" area "square feet.")
