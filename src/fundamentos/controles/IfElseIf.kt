package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 8.3

    //Usando o operador range
    if(nota in 9..10){
        println("Fantástico")
    }else if(nota in 7..9){
        println("Parabéns")
    }else if(nota in 4..6){
        println("Tem como recuperar")
    }else if(nota in 0..3){
        println("Te vejo no próximo semestre")
    }else{
        println("Nota inválida")
    }
}