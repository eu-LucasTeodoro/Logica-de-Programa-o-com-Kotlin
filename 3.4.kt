fun main (){
    //Leia dois inteiros (sendo o primeiro menor que o segundo) e calcule a média desses números e de todos os inteiros entre eles.

    var soma = 0.0
    var media = 0.0
    var contador = 0.0

    print("Informe dois numeros (sendo o primeiro menor que o segundo): ")
    var n1: Int = readlnOrNull()!!.toInt()
    var n2: Int = readlnOrNull()!!.toInt()

    while (n1 >= n2){
        print("Numero invalido, tente novamente! sendo o primeiro menor que o segundo) ")
        n1 = readlnOrNull()!!.toInt()
        n2 = readlnOrNull()!!.toInt()
    }
    for (i in n1..n2){
        soma = soma + i
        contador = contador + 1
    }
    media = soma / contador
    print("A média de $n1 e $n2 é: $media")
}