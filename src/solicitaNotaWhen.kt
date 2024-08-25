/*
*  --Questão 4--
*  Repita o exercício anterior usando when para avaliar a nota informada e decidir qual texto apresentar
*  Arquivo: solicitaNotaWhen;
*  Função: avaliaResultadoWhen()
*/

fun avaliaResultadoWhen(nota: Int) {
    val qualificador = when (nota) {
        1 -> "Péssimo"
        2 -> "Ruim"
        3 -> "Satisfatório"
        4 -> "Bom"
        5 -> "Ótimo"
        else -> "Nota inválida"
    }
    println(qualificador)
}

fun main() {
    print("Digite uma nota entre 1 e 5: ")
    val entrada = readLine()?.toIntOrNull()

    if (entrada == null) {
        println("Entrada inválida. Por favor, insira um número inteiro.")
    } else {
        avaliaResultadoWhen(entrada)
    }
}