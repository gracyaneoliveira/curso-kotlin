package fundamentos

fun main(args: Array<String>) {
    val a = 1

    //Número para String
    println(a.toString())
    println(a.toString() + 1 )

    //String para Número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull() ?: 0 )
    //println("Teste".toInt()) // NumberFormatException
    println("1".toInt() + 1)
}