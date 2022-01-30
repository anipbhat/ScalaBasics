package com.amazon
package labs.oops

object OOBasicsKnowledgeCheck extends App {

  val writer = new Writer("Archana", "Tikayat Ray", 1994)

  println(writer.fullName())
  val novel = new Novel("NLP goodness", 2022, writer)

  println(novel.authorAgeAtYearOfRelease())
  println(novel.isWrittenBy(new Writer("Archana", "Tikayat Ray", 1994)))
  println(novel.isWrittenBy(writer))
  val newNovel =  novel.copy(2023)

  println(newNovel.authorAgeAtYearOfRelease())

  val counter = new Counter(5)

  counter.printer
  counter.incrementCount().printer
  counter.decrementCount().printer
  counter.incrementCount(20).printer
  counter.decrementCount(100).printer
}

//class Person(name: String, val age: Int = 0) {
//
//}

/* Novel and a Writer

Writer: Fisrt name, last name , year
- method returns full name

Novel: name, year of release, author
- author age
-isWrittenBy(author)
-copy (new year of release) = new instance of Novel
 */

class Writer(firstName: String, lastName: String, val yearOfBirth: Int) {
  def fullName(): String = firstName + " " + lastName
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAgeAtYearOfRelease(): Int = yearOfRelease - author.yearOfBirth

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease:Int): Novel = new Novel(this.name, newYearOfRelease, this.author)
}
/*
Counter class
  receives an int value
  method current count
  method to increment / decrement => new counter
  overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {

  def incrementCount(): Counter = {
    println("Incrementing")
    new Counter(count + 1)
  } // Immutability

  def decrementCount(): Counter = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def incrementCount(amount: Int): Counter = {
    if (amount <= 0) this
    else incrementCount().incrementCount(amount - 1)
  }

  def decrementCount(amount: Int): Counter = {
    if (amount <= 0) this
    else decrementCount().decrementCount(amount - 1)
  }

  def printer: Unit = println(count)
}