package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo","Willian","Andreia","Caio")
    val ordenados = nomes.sortedBy { it }
//    val ordenados = nomes.sortedBy { it.reversed() }
//    val ordenados = nomes.sortedBy ({ it })

    println(ordenados)
}