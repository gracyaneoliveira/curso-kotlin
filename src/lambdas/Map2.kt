package lambdas

class Produto (val nome: String, val preco: Double)

val materialEscolar = listOf (
        Produto ("Fichário escolar", 21.90),
        Produto ("Lápis de cor", 11.90),
        Produto ("Borracha", 0.70),
        Produto ("Apontador com depósito", 1.80)
)

fun main(args: Array<String>) {
    //funcao lambda
    val totalizar = { total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map{ it.preco }.reduce(totalizar)

    println("O preco médio é R$ ${precoTotal / materialEscolar.size}")
}