fun main (){

    print("Informe um numero: ")
    val n1 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Informe um numero: ")
    val n2 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Informe um numero: ")
    val n3 = readlnOrNull()?.toIntOrNull() ?: 0

    var soma: Int

    if (n1 < n2 && n1 < n3){
        soma = n2 + n3
        print("a soma de $n2 + $n3 é: $soma")
    }
    else if (n2 < n1 && n2 < n3){
        soma = n1 + n3
        print("A soma de $n1 + $n3 é: $soma")
    }
    else if (n3 < n1 && n3 < n2) {
        soma = n2 + n3
        print("A soma de $n1 + $n2 é : $soma")
    }
    else {
        print("Os numeros são iguais")
    }
}