(ns helda-cli.core
  (:gen-class)
  (require
    [helda-cli.dsl.entities :as entities]
    [helda-cli.dsl.models :as models]
    )
  )

(def cur-model (atom nil))

(defn new-model! [package model-name]
  (reset! cur-model (models/new-model package model-name))
  )

(defn extends! [& models]
  (swap! cur-model #(apply models/extends % models))
  )

(defn add-field! [field-name field-schema]
  (swap! cur-model models/add-field field-name field-schema)
  )

(defn add-action! [action-name target-model]
  (swap! cur-model models/add-action action-name target-model)
  )

(def cur-entity (atom nil))

(defn new-entity! [world model]
  (reset! cur-entity (entities/new-entity world model))
  )

(defn tags! [& tags-list]
  (swap! cur-entity #(apply entities/tags % tags-list))
  )

(defn description! [entity description-text]
  (swap! cur-entity entities/description description-text)
  )

(defn set-attr! [entity a v]
  (swap! cur-entity entities/set-attr a v)
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Please use lein repl")
  )
