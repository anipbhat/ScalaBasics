package com.amazon
package labs.oops

object OOBasics extends App {

  val person = new Person("Annie", 27)
  println(person.age)
  person.greet("Ani")
  person.greet()
}

//Constructor
class Person(name: String, val age: Int = 0) {
  //Body
  val x = 2 // This is a field

  println(1 + 3) //Side effect

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //Overloading -Same name but different signature
  def greet(): Unit = println(s"Hi, I am $name")

  //Multiple constructor or overloading constructors
  def this(name: String) = this(name, 0) //Not really needed as you can provide default parameter
}
//class parameter are not fields. Add keyword val to class parameters to convert them to fields
