fun main () {


    println(" informe um numeros: ")
    var x: Int
    var y: Int

    x = readln().toInt()
    println("Informe outro numero")
    y = readln().toInt()

    var numeros = listOf<Int>(x, y)

    if (x > y) {
        println("$x é maior")
    } else {
        println("$y é maior")
    }
}