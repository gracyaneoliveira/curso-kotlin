package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object { //Como se fosse objeto singleton
        @JvmStatic val constanteDeClasse = "Ciclano" //simulando um static
    } //membros static sempre dentro do companion object

    fun fazer() {
        val local: Int = 7

        if(local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}