(ns app.server
  (:require [integrant.core :as ig]
            [immutant.web :as immutant]))

;;
;; Web server:
;;

(def +default-opts+ {:host "localhost"
                     :port 3000
                     :path "/"})

(defmethod ig/init-key ::server [_ {:keys [handler] :as opts}]
  (immutant/run handler (-> (merge +default-opts+ opts)
                            (dissoc :handler))))

(defmethod ig/halt-key! ::server [_ server]
  (immutant/stop server))
