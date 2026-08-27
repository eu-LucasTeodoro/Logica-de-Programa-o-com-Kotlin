fun main (){
    print("Informe um numero: ")
    var n1 = readlnOrNull()?.toIntOrNull()?:0

    if (n1 >0){
        print("$n1 é positivo")
    }
    if (n1 <0){
        print("$n1 este é negativo")
       }
    if (n1 ==0) {
        print("$n1 este é o numero 0")
    }


    }


