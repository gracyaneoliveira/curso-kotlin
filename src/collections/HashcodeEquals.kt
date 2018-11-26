package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        if (other is Objeto) {
            return nome.equals(other.nome, ignoreCase = true)
        } else {
            return false
        }
    }

//    override fun equals(other: Any?) = if (other is Objeto) {
//        nome.equals(other.nome, ignoreCase = true)
//    } else {
//        false
//    }
}

fun main(args: Array<String>) {
    val conjunto = hashSetOf(Objeto("Cadeira","..."),
            Objeto("Mesa","..."), // Hahcode = 4
            Objeto("Faca","..."), // Hahcode = 4
            Objeto("Copo","...") // Hahcode = 4
    )

    conjunto.contains(Objeto("faca","????")).print()
}