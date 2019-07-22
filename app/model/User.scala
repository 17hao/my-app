package model

import form.UserForm

case class User(id: Option[Int], name: String, age: Option[Int], city: Option[String]) {
  self =>
  def getId: Int = id.get

  def buildUser(form: UserForm) = User(
    id = None,
    name = form.name,
    age = form.age,
    city = form.city
  )
}