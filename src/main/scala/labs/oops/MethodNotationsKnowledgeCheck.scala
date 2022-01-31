package labs.oops

object MethodNotationsKnowledgeCheck extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangsOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_~ : String = s"$name is cool"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name"

    def +(person: Person): String = s"${this.name} plus ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def learns(subject: String): String = s"$name learns $subject"

    def learnsScala: String = learns("Scala")

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

  }

  val mary = new Person("Mary", "Inception")

  println((mary + "the rockstar").name)
  println((+(+mary)).age)
  println(mary.learnsScala)
  println(mary(5))

}

/*
Overload + operator
recevice string and
marry + "the rockstar" => new person "mary (the tockstar)"

2. Add an age to the person class
Add a unary + operator => new person with the age + 1
+maty => mary wioth age invcrement

3. Add a "learns" method in th eperson class => "Mary learns Scala"
Add a learnsScala method, calls learns method with "Scala"
Use it in postfix notation

4. Overload apply meothod
mary.apply(2) => Mary watched Inceptoin 2 times"
 */