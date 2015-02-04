object HelloWorld {
   /* This is my first scala program.  
    * This will print 'Hello scala!' as the output
    */
   def main(args: Array[String]) {
      println("Hello, Scala!") // prints Hello World
      val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
      println(myVar1+"\t"+myVar2)
   }
}