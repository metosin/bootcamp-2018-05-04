(ns app.main
  (:require [clojure.tools.logging :as log]
            [integrant.core :as ig]
            [app.components :as c])
  (:gen-class))

(defn -main [& args]
  (log/info "application starting...")
  (ig/init c/components)
  (log/info "application ready"))
