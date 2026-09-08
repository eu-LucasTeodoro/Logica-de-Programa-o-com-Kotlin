fun main (){
    var n1 = 0.0
    var n2 = 0.0
    var div = 0.0

    for (i in 1..2){
        println("Informe dois numeros: ")
        n1 = readln().toDouble()
        n2 = readln().toDouble()
        while (n2 <= 0){
            print("Numero invalido. Tente novamente!")
            n2 = readln().toDouble()
        }
        div = n1/n2
        print("A disão de $n1 e $n2 é: $div")
        break
    }

}


