(ns helda-cli.core
  (:gen-class)
  (require
    [helda-cli.dsl.entities.browse :refer [find-entities lookup-entity]]
    [helda-cli.dsl.models.browse :as models]
    )
  )


(def cur-world (atom nil))

(def cur-tags (atom nil))
(def cur-models (atom nil))

(def source-entity (atom nil))
(def target-entity (atom nil))

(defn load-world [world] (reset! cur-world world))

(defn clear-tag-filter [] (reset! cur-tags nil))
(defn filter-by-tag [tag] (swap! cur-tags conj tag))

(defn clear-model-filter [] (reset! cur-models nil))
(defn filter-by-model [model] (swap! cur-models conj model))

(defn browse-entities [] (find-entities @cur-models @cur-tags))

(defn load-source-entity [id] (reset! source-entity (lookup-entity id)))
(defn load-target-entity [id] (reset! target-entity (lookup-entity id)))

(defn -main [& args]
  (println "Please use lein repl")
  )
