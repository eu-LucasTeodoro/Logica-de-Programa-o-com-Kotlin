fun main (){
    // Calcule e exiba a média aritmética dos números inteiros de 15 a 100 (inclusive).

    var soma = 0.0
    var quantidade = 0

    for (i in 15..100){
        soma += i
        quantidade = quantidade + 1
    }

    var media = soma/quantidade
    print("A media dos numeros inteiros é: $media")
}
