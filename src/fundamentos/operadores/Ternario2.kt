package fundamentos.operadores

fun obterResultado(nota: Double) : String = if (nota >= 7.0 ) "Passou" else "Reprovou"

fun obterResultado2(nota: Double) : String {
    return if (nota >= 7.0 ) "Passou" else "Reprovou"
}


fun main(args: Array<String>) {
    println(obterResultado(8.3))
    println(obterResultado2(10.0))
}