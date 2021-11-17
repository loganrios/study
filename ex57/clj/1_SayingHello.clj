(defn say-hello [name]
  (println (str "Hello, " name ", nice to meet you!")))

(defn get-name []
  (print "What is your name? ")
  (flush)
  (read-line))


;; a version without variables
;; this is scuffed, currently prints 'nil nil [name]'

(defn say-hello []
  (println "Hello, "
           (print "What is your name?")
           (flush)
           (read-line)
           ", nice to meet you!"))

(say-hello)
