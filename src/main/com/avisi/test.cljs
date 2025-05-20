(ns com.avisi.test
  (:require
    ["agentkeepalive" :refer [HttpsAgent]]))

(println "Creating https-agent")
(def https-agent
  (HttpsAgent.
    #js {:keepAlive true
         :maxSockets 100
         :maxFreeSockets 10
         ;; 60 seconds timeout
         :timeout 60000
         ;; Free socket timout 30 seconds
         :freeSocketTimeout 30000}))
(println "Created https-agent")

(defn my-export [x] (str x " from shadow-cljs"))

