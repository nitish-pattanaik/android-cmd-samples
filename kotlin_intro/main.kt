// Gloabal Variable
/* block line commments can be nested
val PI = 3.14
var x = 12
var y :String = "normal variable"
/* this works */
 */
var z = "normal variable"
fun sum(a: Int, b: Int): Int {
	return a+b
}

// A function body can be an expression
fun mult(a: Int, b: Int) = a * b

//  Unit means void
fun div(a: Int, b: Int): Unit {
	println("Division of $a and $b is ${a/b}")
}

fun floatDiv(a: Float, b: Float) : Unit {
	println("FloatDiv of $a and $b is ${a/b}")
}
fun main() {
	print("print to console: ")
	println("Hello From Main")

	val a = 5 ; val b = 4
	println("sum of $a and $b is ${sum(a, b)}")

	println("Multiplication of $a and $b is ${mult(a, b)}")

	div(a, b)

	val x : Float = 5f; val y : Float = 6f
	floatDiv(x, y)

	val c :Int = 34
	println("Value of c is : $c")

	//some strings
	z += " " + "hello"
	var k = "$z and me"
	println("z is: $z")
	println("k is: $k")

	// conditionals
	maxOf(a, b)

	println("Max of three is: ${maxOfThree(1232342, 4234324, 53432)}")

	val items = listOf("apple", "ball", "cat", "dog")
	print("list items are: ")
	for (i in items) print("$i ")
}

/*
 you can define function anywhere in the source code.. No need of declaration
 fun maxOf(x: Int, y: Int) :Unit {
 	print("Maximum of $x and $y is: ")
 	println(if (x > y) x else y)
 }
*/

// Above function can be written in one line
fun maxOf(x: Int, y: Int) = println("Max of $x and $y is: ${if (x > y) x else y}")


// nested functions
fun maxOfThree(x: Int, y: Int, z: Int) :Int {
	// nested functions are allowed
	fun nested(a: Int, b: Int, c: Int) :Int {
		return if(a > b && a > c) a else if (b > c && b > a) b else c
	}

	fun n2() :Int { //x, y, z are already in the scope of n2
		return if(x > y && x > z) x else if (y > z && y > x) y else z
	}
	return n2()
}
