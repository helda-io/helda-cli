(use 'helda-cli.dsl.models)

(-> (new-model "owgame" "Hero")
  (extends "geo.GeoItem")
  (add-field :name "String")
  (add-field :bio "String")
  (add-field :strength "Integer")
  (add-field :dexterity "Integer")
  (add-field :constitution "Integer")
  (add-field :intelligence "Integer")
  (add-field :wisdom "Integer")
  (add-field :charisma "Integer")
  println
  )

(use 'helda-cli.dsl.entities)

(let [world "owgame-dev"]
  (-> (new-entity world "owgame.Hero")
    (tags :warrior :hero :unit)
    (description "This is our first Hero!")
    (set-attr :name "Sir Drago")
    (set-attr :bio "Sir Drago is Dragonborn")
    (set-attr :strength 7)
    (set-attr :dexterity 5)
    (set-attr :constitution 9)
    (set-attr :intelligence 5)
    (set-attr :wisdom 6)
    (set-attr :charisma 4)
    println
    )
  )
