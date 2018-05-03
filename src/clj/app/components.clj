(ns app.components
  (:require [integrant.core :as ig]
            [app.server :as server]
            [app.routes :as routes]
            [app.db :as db]))

(def components
  {::server/server {:handler (ig/ref ::routes/handler)}
   ::routes/handler {:ctx {:db (ig/ref ::db/db)}}
   ::db/db {:config {}}
   ::db/migrate {:db (ig/ref ::db/db)}})
