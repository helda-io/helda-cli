(ns helda-cli.dsl.models

  )

(defn new-model [package model-name]
  (-> {}
    (assoc :package (name package))
    (assoc :name (name model-name))
    )
  )

(defn extends [model & models]
  (assoc model :extends models)
  )

(defn add-field [model field-name field-schema]
  (update model :fields assoc field-name field-schema)
  )

(defn add-action [model action-name target-model]
  (update model :actions assoc action-name target-model)
  )
