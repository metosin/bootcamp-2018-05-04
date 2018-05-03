(ns app.index
  (:require [ring.util.http-response :as resp]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]))

;;
;; Index page
;;

(def index
  (-> (hiccup/html
        (page/html5
          [:head {:lang "en"}
           [:title "Bootcamp 2018-05-04 sample app"]
           [:meta {:charset "utf-8"}]
           [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
           [:meta {:name "viewport" :content "width=device-width, initial-scale=1, shrink-to-fit=no"}]
           (page/include-css "/css/style.css")]
          [:body
           [:h1 "Hello"]
           [:div.page
            "Check out the fancy " [:a {:href "/swagger"} "swagger"] " documentation."]]))
      (resp/ok)
      (resp/content-type "text/html; charset=utf-8")))
