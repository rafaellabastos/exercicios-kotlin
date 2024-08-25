/*
*  --Questão 10--
*  Desenvolva uma função cujo seu retorno é um tipo de dado String
 */

fun criarMensagem(nome: String, idade: Int): String {
    return "Olá, meu nome é $nome e eu tenho $idade anos."
}

fun main() {
    print("Digite seu nome: ")
    val nome = readLine() ?: ""

    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0
    
    val mensagem = criarMensagem(nome, idade)
    println(mensagem)
}