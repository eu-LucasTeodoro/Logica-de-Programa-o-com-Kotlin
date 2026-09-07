fun main (){

    var soma = 0.0
    var media = 0.0
    var numeros = mutableListOf<Int>()


    for (i in 1..6){
        print("Informe um numero: ")
        val numero = readlnOrNull()?.toInt() ?: 0
        soma = soma + numero
        numeros.add(numero)
    }
    media = soma/ 6
    print("A média dos numeros citados é: $media")
    println(" os numeros citados foram: $numeros")
}