package collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val string = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")
    val uniao = numeros + string // sobrecarga de operadores

    println(uniao)

    for (item in uniao) {
        println(item)
    }
}