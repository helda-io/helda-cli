(ns helda-cli.client.entities
  (:require
    [clj-http.client :as client]
    )
  )

(defn find-entities [models tags]

  )

(defn lookup-entity [id]

  )

(defn save-entity [entity]
  (client/post
    "http://localhost:3000/entities/save-entity"
    {
      :form-params entity
      :content-type :json
      }
    )
  )
