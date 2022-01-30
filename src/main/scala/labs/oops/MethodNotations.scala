package labs.oops

import scala.language.postfixOps


object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangsOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_~ : String = s"$name is cool"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation / operator notation / syntactic sugars

  // "operators" / infix notation
  val tom = new Person("Tom", "Fight Club")
  println(mary hangsOutWith tom)

  //All operators are methods
  println(1 + 2)
  //is equal to
  println(1.+(2))

  //prefix notation
  val x = -1
  //equivalent to
  val y = 1.unary_-

  println(~tom)

  //postfix notation
  println(mary.isAlive)
  //need to import postfix operator isAlive needs to be enabled
  //by making the implicit value scala.language.postfixOps visible.
  println(mary isAlive)

  //apply
  println(mary.apply())
  //is equivalent to
  println(mary())
}
