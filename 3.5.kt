fun main (){

    // Leia 2 notas de um aluno, calcule a média final e considere aprovação com nota 9,5. Em seguida, pergunte: Calcular a média de outro aluno? (S/N). Se a resposta for S, repita; caso contrário, encerre e mostre a quantidade de alunos aprovados.

    var nota1: Int
    var nota2: Int
    var media: Double
    var aprovados = 0
    var resposta = "s"

    while (resposta.equals("s", ignoreCase = true)) {
        print("Nota de matemática: ")
        nota1 = readlnOrNull()!!.toInt()
        print("Nota de português: ")
        nota2 = readlnOrNull()!!.toInt()

    media = (nota1 + nota2) / 2.0
    if (media >= 9.5){
        aprovados = aprovados + 1
        println("Aprovado!")
    }
        else {
            print("Reprovado!")
        }
    print("Calcuar a média de outro aluno? (s/n): ")
    resposta = readlnOrNull()!!
    }
    println("Qauntidade de aprovados: $aprovados")

}