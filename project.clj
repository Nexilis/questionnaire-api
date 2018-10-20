 (defproject blu-lama.api "0.1.0-SNAPSHOT"
   :description "RESTful API for a Questionnaire"
   :dependencies [[org.clojure/clojure "1.9.0"]
                  [metosin/compojure-api "1.1.11"]
                  [proto-repl "0.3.1"]]
   :ring {:handler blu-lama.api.handler/app}
   :uberjar-name "server.jar"
   :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]
                                   [cheshire "5.5.0"]
                                   [ring/ring-mock "0.3.0"]
                                   [midje "1.8.3"]]
                    :plugins [[lein-ring "0.12.0"]
                              [lein-midje "3.2"]]}})
