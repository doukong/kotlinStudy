/*fun sum(a:Int, b:Int): Int {
    return a+b
}

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3,5))
}*/
/*
fun sum(a:Int, b:Int) = a+b

fun main() {
    println("sum of 19 and 23 is ${sum(19,23)}")
}*/

/*
fun printSum(a: Int, b:Int) : Unit {
    println("sum of $a and $b is ${a+b}")
}

fun main() {
    printSum(-1,8)
}*/

/*
fun printSum(a: Int, b:Int){
    println("sum of $a and $b is ${a+b}")
}

fun main() {
    printSum(-1,8)
}
        */

/*
fun main() {
    val a : Int = 1 //a의 형식을 지정하고 값 할당
    val b = 2 // int 타입이라는게 암시됨
    val c : Int // 형식할당따로
    c = 3

    println ("a = $a, b = $b, c = $c")
}*/

/*
val PI = 3.14 //val은 값고정
var x = 0     //var은 값변환

fun incrementX() {
    x += 1
}

fun main() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}*/
/*
fun main() {
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}*/

/*
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}*/

/*
fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}*/


/*
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}


fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}*/

/*
fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}*/

/*
fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}*/

/*
//Switch Case같음
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}*/


//변수 in 시작..끝 => 변수값이 시작부터 끝까지 +1
/*
fun main() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun main() {
    for (x in 1..5) {
        print(x)
    }
}*/


//step은 +n downTo는 --
/*
fun main() {
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}*/

//array.map같은역활
fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}