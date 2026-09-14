fun main(){
    //Leia um valor N (N > 0) e imprima todos os inteiros de 1 até N.

    var num: Int

    print("Informe um numero maior que 0: ")
    num = readlnOrNull()!!.toInt()
    while (num <= 0){
        print("Numero invalido. Tente novamente!: ")
        num = readlnOrNull()!!.toInt()
    }
    for (i in 1 .. num ){
        println("Numeros: $i")
    }
}