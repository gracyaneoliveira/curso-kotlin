package oo.encapsulamento

private val dentroDoArquivo = 1
//protected val protegidoNaosuportadoAqui = 1
internal val dentroDoProjeto = 1
val publico = 1

private fun dentroDoArquivo() = 1
//protected fun protegidoNaosuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
fun publico() = 1

// So poderá ser herdada se tiver como open
open class Capsula {
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula() {
    fun verificarAcesso() {
//        println(Capsula().dentroDoObjeto) //private nao e passado por heranca
//        println(Capsula().vaiPorHeranca)
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico())
    }
}

fun verificarAcesso() {
//    println(Capsula().dentroDoObjeto())
//    println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto()) //internal
    println(Capsula().publico())
}

