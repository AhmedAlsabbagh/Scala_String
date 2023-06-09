object StringDemoA {
  def main(args: Array[String]): Unit = {
    var greetings = "Hello World!"       // Data type String is not defined. Auto interpreted
    println(greetings)
    var greetingsNew:String = "Hello Egypt!"  // Data type String is defined
    println(greetingsNew)

    // Method to get length of String (Accessor Method - Any method {Eg length()} used to get information of an object {Eg: greetings} is called Accessor Method)
    var lengthOfString = greetings.length()
    println("Length of String greetings : Hello World! is " + lengthOfString)

    // concat method
    var var1 = "Hello "
    var var2 = "World"
    println(var1 + var2 + "!")    // You can concat using + operator/method
    println(var1.concat(var2))    // you can also use concat method

    var var3 = var1 + var2 + "!"
    println(var3.length)

    println(var3.charAt(6))       // To get character at a given index

    // Equals method
    var varA = "Hello World!"
    var varB = "Hello World!"
    println(varA.equals(varB))   // Gives true, if both the Strings are having same contents
    println(varA == varB)        // Note: Same as equals. But does one additional step. It first checks varA and varB are not null

    // String Formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 500000
    var milageOfCar = 8.5

    printf("Name of Car is %s and cost of Car is %d and milage of Car is %f", nameOfCar, costOfCar, milageOfCar)

    // Multi Line Strings - Note: Use 3 double inverted commas """ string """. Also use | symbol and stripMargin function for orientation
    println("")

    var multiLineStringA =
      """Hello
        World
        How
        are
        you
      """
    println(multiLineStringA)

    var multiLineString =
      """Hello
        |World
        |How
        |are
        |you
      """.stripMargin
    println(multiLineString)

    var multiLineStringB =
      """Hello
        $World
        $How
        $are
        $you
      """.stripMargin('$')
    println(multiLineStringB)

// String Interpolation - Scala 2.10 onwards
//    1. 's' String Interpolator
    var name = "PM Modi"
    println("Hello " + name + ", How are you?")  // using + to concat
    println(s"Hello $name, How are you?")         // using s interpolator. Widely used

//    2. 'f' Interpolator
    name = "PM Modi"
    var salary = 20000.2
    println(f"Name is $name%s and salary is $salary%8.2f and designation is PM")

    // 3. raw Interpolator - Same as s interpolator but does not perform escaping. escaping - \n \t
    println(s"Hello World!\nHow are you?")
    println(raw"Hello World!\nHow are you?")
    
  }
}
