(use 'helda-cli.dsl.models)

(-> (new-model "owgame" "Hero")
  (extends "geo.GeoItem")
  (add-field :name "Str")
  (add-field :bio "Str")
  (add-field :strength "Int")
  (add-field :dexterity "Int")
  (add-field :constitution "Int")
  (add-field :intelligence "Int")
  (add-field :wisdom "Int")
  (add-field :charisma "Int")
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
