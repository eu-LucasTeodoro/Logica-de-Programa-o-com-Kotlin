fun main(){
    //Leia 6 notas válidas (de 0 a 10), calcule e exiba a média simples.

    var nota: Double
    var media: Double
    var soma: Double = 0.0

    for (i in 1..6){
        print("Informe uma nota: ")
        nota = readln().toDouble()
        while (nota <=0 || nota >= 10){
        print("Nota invalida. Tente novamente (de 0 a 10) ")
            nota = readln().toDouble()
        }
        soma += nota
    }
    media = soma / 6.0
    println("A média das notas é: $media: ")
}