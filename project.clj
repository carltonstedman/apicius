(defproject apicius "0.1.0-SNAPSHOT"
  :description "Clojure implementation of Chef Cookbook Sites API"
  :author "Carlton Stedman"
  :twitter "@carltonstedman"
  :url "http://github.com/carltonstedman/apicius"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring-server "0.3.1"]
                 [ring/ring-json "0.2.0"]
                 [cheshire "5.3.0"]
                 [korma "0.3.0-RC6"]
                 [org.xerial/sqlite-jdbc "3.7.2"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler apicius.handler/app
         :init apicius.handler/init
         :destroy apicius.handler/destroy}
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.1"]]}})
