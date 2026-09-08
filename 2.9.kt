fun main (){
    val Anoatual = 2026

    print("Informe seu ano de nascimento: ")
    val nascimento = readln().toInt()

    val idade = Anoatual - nascimento

    if (idade >= 18){
        print("Você pode votar este ano! ")
    }
    else {
        print("Você não pode votar!")
    }
}