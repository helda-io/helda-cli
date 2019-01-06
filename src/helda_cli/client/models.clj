(ns helda-cli.client.models
  (:require
    [clj-http.client :as client]
    )
  )

(defn save-model [package name model]
  (client/post
    "http://localhost:3000/models/save-model"
    {
      :form-params model
      :content-type :json
      }
    )
  )
