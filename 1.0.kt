fun main (){

// 1.1 a 1.3
    val nome_do_carro = "fusca"
    println(nome_do_carro)
    print("Qual o seu nome?: ")
    val nome: String = readln()

    println("Olá $nome")

    println("$nome qual a sua idade?")
    val idade: Int = readln().toInt()

    println("Entendi, seu nome é $nome e você tem $idade anos")

}