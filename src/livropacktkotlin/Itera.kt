package livropacktkotlin

import java.util.*

fun main(args: Array<String>) {
    val iterator = (1..3).iterator()
    // skip an element
    if (iterator.hasNext()) {
        iterator.next()
    }

    // do something with the rest of elements
    iterator.forEach {
        println("The element is $it")
    }
}
