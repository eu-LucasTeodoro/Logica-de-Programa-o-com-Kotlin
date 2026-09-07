fun main (){

    //Leia 4 valores diferentes e informe apenas o primeiro, o último e o maior deles.
    val numeros = mutableListOf<Int>()

    for (i in 1..4){
        print("Informe um numero: ")
        val n= readlnOrNull()?.toInt() ?: 0
        numeros.add(n)
    }
    val primeiro = numeros.first()
    println("Este é o primeiro numero digitado: $primeiro")
    val ultimo = numeros.last()
    println("Este é o o ultimo numero digitado: $ultimo")
    val maior = numeros.maxOrNull()
    println("Este é o maior numero digitado: $maior")
}
