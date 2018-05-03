(ns app.routes
  (:require [clojure.tools.logging :as log]
            [integrant.core :as ig]
            [compojure.api.sweet :refer :all]
            [ring.util.http-response :as resp]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [compojure.api.middleware :as mw]
            [app.messages :as messages]
            [app.index :as index]))

;;
;; API handler:
;;

(def api-handler
  (api
    {:swagger {:ui "/swagger"
               :spec "/swagger.json"
               :data {:info {:title "Bootcamp 2018-05-04",
                             :description "Sample app API"}}}}

    (undocumented
      (GET "/" []
        index/index))

    (context "/api" []
      messages/routes)))

;;
;; HTTP request handler:
;;

(def site-config (assoc-in site-defaults [:security :anti-forgery] false))

(defmethod ig/init-key ::handler [_ {:keys [ctx]}]
  (some-fn (-> api-handler
               (mw/wrap-components ctx)
               (wrap-defaults site-config))
           (-> (resp/not-found "¿Qué?")
               (resp/content-type "text/plain; charset=utf-8")
               (constantly))))
