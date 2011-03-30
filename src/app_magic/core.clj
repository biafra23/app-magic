(ns app-magic.core
  (:require [appengine-magic.core :as ae]))


(defn app-magic-app-handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, brave new Clojure world!"})


(ae/def-appengine-app app-magic-app #'app-magic-app-handler)