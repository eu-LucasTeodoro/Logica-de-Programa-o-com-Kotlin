fun main () {
    print("informe um numero: ")
    var a: Int
    a = readlnOrNull()?.toIntOrNull() ?: 0

    print("Informe outro numero: ")
    var b: Int
    b = readlnOrNull()?.toIntOrNull() ?: 0

    print("Informe o ultimo numero: ")
    var c: Int
    c = readlnOrNull()?.toIntOrNull() ?: 0

    if (a > b && a > c) {
        print("$a é maior é mairo")
    }
    if (b > a && b > c) {
        print("$b é maior é maior")
    } else
        print ("$b é menor que $c")
}
    }
}