(ns helda-cli.dsl.models.create

  )

(defn new-model [package model-name]
  {
    :package (name package)
    :name (name model-name)
    :full-name (str (name package) "." (name model-name))
    :extends []
    :fields {}
    :actions {}
    }
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
