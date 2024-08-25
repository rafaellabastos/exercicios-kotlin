/*
 *  --Questão 9--
 *  Desenvolva uma classe na qual receberá no mínimo 05 argumentos em seus construtor. Obs.: o usuário irá descrever
 *  os argumentos
 */

class InformacoesPessoa(
    val nome: String,
    val idade: Int,
    val email: String,
    val endereco: String,
    val telefone: String
) {
    fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Email: $email")
        println("Endereço: $endereco")
        println("Telefone: $telefone")
    }
}

fun main() {
    print("Digite o nome: ")
    val nome = readLine() ?: ""

    print("Digite a idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    print("Digite o email: ")
    val email = readLine() ?: ""

    print("Digite o endereço: ")
    val endereco = readLine() ?: ""

    print("Digite o telefone: ")
    val telefone = readLine() ?: ""

    val pessoa = InformacoesPessoa(nome, idade, email, endereco, telefone)
    
    println("\nInformações da Pessoa:")
    pessoa.exibirInformacoes()
}