fun main (){
    // Leia 10 valores e informe quantos estão no intervalo de 24 a 42 (inclusive) e quantos estão fora.

    var valor: Int
    var dentro: Int = 0
    var fora: Int = 0

    for (i in 1..10) {
        print("informe um valor: ")
        valor = readln().toInt()
        if (valor >= 24 && valor <= 42){
            dentro = dentro + 1
        }else {
            fora = fora + 1
        }
    }
    print("$dentro, estão dentro do intervalo e $fora, estão fora")
}