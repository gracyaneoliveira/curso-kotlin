package collections

fun main(args: Array<String>) {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")
//    val strings = arrayListOf<String>("Carro", "Moto", "Barco", "Avião")

    for(item in strings) {
        println(item.toUpperCase())
    }
}