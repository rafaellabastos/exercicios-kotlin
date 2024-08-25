/*
*  --Questão 6--
*  Faça um loop de 1 até um número informado pelo usuário incrementando de 2 em 2
*/

fun fazerLoop() {
    print("Digite o número final do loop: ")
    val numeroFinal = readLine()?.toIntOrNull()

    if (numeroFinal == null || numeroFinal <= 0) {
        println("Entrada inválida. Por favor, insira um número inteiro positivo.")
        return
    }

    for (i in 1..numeroFinal step 2) {
        println(i)
    }
}

fun main() {
    fazerLoop()
}