/*
*  --Questão 3--
*  Objetivo: solicitar ao usuário que informe uma nota entre 1 e 5 e, conforme a nota, apresentar o qualificador.
*  Arquivo: solicitaNotaIf.kt
*  Função: avaliaResultadoIf()
*  Instruções:
*   Declarar variável nota
*   Receber do usuário o valor da nota entre 1 e 5
*   Nota 1 = péssimo; Nota 2 = ruim; Nota 3 = satisfatório; Nota 4 = bom; Nota 5 = ótimo; Senão = nota inválida
 */

fun avaliaResultadoIf(nota: Int) {
    if (nota == 1) {
        println("Péssimo")
    } else if (nota == 2) {
        println("Ruim")
    } else if (nota == 3) {
        println("Satisfatório")
    } else if (nota == 4) {
        println("Bom")
    } else if (nota == 5) {
        println("Ótimo")
    } else {
        println("Nota inválida")
    }
}

fun main() {
    print("Digite uma nota entre 1 e 5: ")
    val entrada = readLine()?.toIntOrNull()

    if (entrada == null) {
        println("Insira um número válido")
    } else {
        avaliaResultadoIf(entrada)
    }
}