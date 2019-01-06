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
