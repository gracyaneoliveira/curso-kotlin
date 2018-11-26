package classes

class Geladeira (val marca: String, val litros: Int)
data class Televisao (val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp",320)
    val g2 = Geladeira("Brastemp",320)

    println(g1 == g2) //equals não vem implementado.

    val tv1 = Televisao("Samsung",32)
    val tv2 = Televisao("Samsung",32)

    println(tv1 == tv2) //equals implementado por padrão
    println(tv1 === tv2) //compara referencias de memórias
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 42))

    // Destructuring somente com data class
    // pois ele cria uma estrutura interna que possibilita
    // o uso do destructuring
    val(marca, pol) = tv1
    println("$marca $pol")
}