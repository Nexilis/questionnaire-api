(defproject blu.questionnaire.api "0.1.0-SNAPSHOT"
  :description "RESTful API for a Questionnaire"
  :url "https://github.com/Nexilis/questionnaire-api"
  :min-lein-version "2.0.0"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [proto-repl "0.3.1"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler blu.questionnaire.api.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
