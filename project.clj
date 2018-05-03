(defproject bootcamp-2018-03-15 "0.0.0-SNAPSHOT"
  :description "Sample clojure app for 2018-05-04 bootcamp"

  :dependencies [[org.clojure/clojure "1.9.0"]

                 ; Common libs:
                 [prismatic/schema "1.1.9"]
                 [danlentz/clj-uuid "0.1.7"]

                 ; Integrant:
                 [integrant "0.6.3"]
                 [integrant/repl "0.3.1"]

                 ; Web:
                 [ring/ring-core "1.6.3"]
                 [ring/ring-defaults "0.3.1"]
                 [metosin/ring-swagger-ui "3.9.0"]
                 [metosin/compojure-api "2.0.0-alpha18"]
                 [metosin/ring-http-response "0.9.0"]
                 [metosin/muuntaja "0.5.0"]
                 [metosin/jsonista "0.2.0"]
                 [org.immutant/web "2.1.10"]

                 ; HTTP and HTML
                 [clj-http "3.9.0"]
                 [hiccup "2.0.0-alpha1"]
                 [enlive "1.1.6"]

                 ; Database
                 [hikari-cp "2.4.0"]
                 [org.postgresql/postgresql "42.2.2"]
                 [funcool/clojure.jdbc "0.9.0"]
                 [org.flywaydb/flyway-core "5.0.7"]

                 ; Logging:
                 [org.clojure/tools.logging "0.4.0"]
                 [org.slf4j/jcl-over-slf4j "1.7.25"]
                 [org.slf4j/jul-to-slf4j "1.7.25"]
                 [org.slf4j/log4j-over-slf4j "1.7.25"]
                 [ch.qos.logback/logback-classic "1.2.3" :exclusions [org.slf4j/slf4j-api]]]

  :source-paths ["src/dev" "src/clj"]
  :test-paths ["test/clj"]
  
  :profiles {:uberjar {:source-paths ^:replace ["src/clj"]
                       :main app.main
                       :aot :all
                       :uberjar-name "app.jar"}})
