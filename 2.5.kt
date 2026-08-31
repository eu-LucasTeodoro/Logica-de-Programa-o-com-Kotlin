fun main (){
    print("Informe um numero: ")
    val n1 = readlnOrNull()?.toIntOrNull()?: 0
    print("Informe um numero: ")
    val n2 = readlnOrNull()?.toIntOrNull()?: 0
    print("Informe um numero: ")
    val n3 = readlnOrNull()?.toIntOrNull()?: 0
    print("Informe um numero: ")
    val n4 = readlnOrNull()?.toIntOrNull()?: 0
    print("Informe um numero: ")
    val n5 = readlnOrNull()?.toIntOrNull()?: 0
    print("Informe um numero: ")
    val n6 = readlnOrNull()?.toIntOrNull()?: 0

    var media = 0.0
    var soma = 0.0

    soma = (n1 + n2 + n3 + n4 + n5 + n6).toDouble()
    media = soma / 6.0

    print("Os números são: $n1, $n2, $n3, $n4, $n5, $n6 e a média deles é: $media")



}