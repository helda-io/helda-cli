(ns helda-cli.dsl.entities)

(defn new-entity [world model]
  (-> {}
    (assoc :world (name world))
    (assoc :model (name model))
    )
  )

(defn tags [entity & tags-list] (assoc entity :tags tags-list))

(defn description [entity description-text]
  (assoc entity :description description-text)
  )

(defn set-attr [entity a v]
  (update entity :attrs assoc a v)
  )
