(ns app-magic.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use app-magic.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method app-magic-app) this request response))
