(ns questionnaire-api.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [org.httpkit.server :refer [run-server]]))

(defroutes myapp
 (GET "/" [] "<h1>Hello World!</h1>")
 (route/not-found "<h1>Page not found</h1>"))

(defn -main [& args]
 (print "Server started... http://localhost:5000")
 (run-server myapp {:port 5000}))
