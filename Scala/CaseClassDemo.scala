object CaseClassDemo {
  def main(args: Array[String]) {
   	val ketan = new Person("Ketan", "Saxena")
	   val divya = new Person("Divya", "Sharma")
   	val umar = new Person("Umar", "siddiqui")
   
      for (person <- List(ketan, divya, umar)) {
         person match {
            case Person("Ketan", "Saxena") => println("Hi Ketan!")
            case Person("Divya", "Sharma") => println("Hi Divya!")
            case Person(name, last) =>
               println("Last Name: " + last + " ,First name: " + name + "?")
         }
      }
   }
   // case class, empty one.
   case class Person(name: String, last: String)
}
