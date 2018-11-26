package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 >= 2)
    println(3 <= 2)

    val d1 = Date(0)
    val d2 = Date(0) // 1 Janeiro de 1970

    // Igualdade Referencial
    println("Resultado com '===' ${d1 === d2}")

    // Igualdade Estrutural
    println("Resultado com '==' ${d1 == d2}")
    println("Resultado com 'equals' ${d1.equals(d2)}")
}