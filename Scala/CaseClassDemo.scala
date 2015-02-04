object CaseClassDemo {
  def main(args: Array[String]) {
   	val alice = new Person("Ketan", "Saxena")
	   val bob = new Person("Divya", "Sharma")
   	val charlie = new Person("Umar", "siddiqui")
   
      for (person <- List(alice, bob, charlie)) {
         person match {
            case Person("Alice", "kooper") => println("Hi Alice!")
            case Person("Bob", "marley") => println("Hi Bob!")
            case Person(name, last) =>
               println("Last Name: " + last + " ,First name: " + name + "?")
         }
      }
   }
   // case class, empty one.
   case class Person(name: String, last: String)
}