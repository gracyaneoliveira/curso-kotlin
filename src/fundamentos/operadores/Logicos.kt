package fundamentos.operadores

fun main(args: Array<String>) {
    val executorTrabalho1: Boolean = true
    val executorTrabalho2: Boolean = true

    val comprouSorvete: Boolean  = executorTrabalho1 || executorTrabalho2
    val comprouTv50: Boolean  = executorTrabalho1 && executorTrabalho2
    val comprouTv32: Boolean  = executorTrabalho1 xor executorTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    // Operador Unário
    if (!comprouSorvete){
        println("A saúde agradece.")
    }
}