fun main (){
    val numeros = mutableListOf<Int>()
    var soma = 0.0

    for (i in 1..4) {
        var num : Int
        while (true) {
            print("Informe um numero: ")
            num = readln().toInt()
            if (num > 0 && num < 10){
                break
            }else {
                println("numero invalido, tente novamente")
            }
        }
        soma += num
        numeros.add(num)
    }
    val media = soma / numeros.size
    println("A média é: $media")

    if ( media > 5 ){
        print("Você passou no teste!")
    }
    else {
        print("Tente novamente.")
    }
}
