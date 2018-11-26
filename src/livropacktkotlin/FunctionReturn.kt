package livropacktkotlin

fun largestNumber (a: Int, b: Int, c:Int): Int {
    fun largest(a: Int, b: Int): Int {
        if (a > b) return a
        else return b
    }
    return largest(largest(a, b), largest(b, c))
}

fun printLessThanTwo() {
    val list = listOf(1, 2, 3, 4)
    list.forEach(fun(x) { // anonymous function
        if(x > 2) println(x)
        else return
    })

    println("This line will still execute.")
}

fun printUntilStop() {
    val list = listOf("a" ,"b", "stop", "c")
    list.forEach stop@ {
        if (it == "stop") return@stop
        else println(it)
    }

    println("This line will still execute.")
}

fun printUntilStop2() {
    val list = listOf("a", "b", "stop", "c")
    list.forEach {
        if (it == "stop") return@forEach
        else println(it)
    }

    println("This line will still execute.")
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("this point is unreachable")
}

fun main(args: Array<String>) {
    val result = largestNumber(1,2,3)
    println(result)

    printLessThanTwo()
    printUntilStop()
    printUntilStop2()
    foo()
}