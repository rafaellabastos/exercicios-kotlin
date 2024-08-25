/*
*  --Questão 7--
*  Faça um loop que o usuário informe nomes de produtos com chave e o preço do produto como valor. Após sair do loop
*  informar com for() os valores de chave e valor. Apresentar o valor médio dos produtos. Por último ordenar em ordem
*  crescente por preço e apresentar os dados com while()
 */

fun fazerLooop() {
    val produtos = mutableMapOf<String, Double>()

    while (true) {
        print("Digite o nome do produto (ou 'sair' para encerrar): ")
        val nomeProduto = readLine()?.trim() ?: continue

        if (nomeProduto.equals("sair", ignoreCase = true)) {
            break
        }

        print("Digite o preço do produto R$: ")
        val precoProduto = readLine()?.toDoubleOrNull()

        if (precoProduto == null || precoProduto < 0) {
            println("Preço inválido. Por favor, insira um número positivo.")
            continue
        }

        produtos[nomeProduto] = precoProduto
    }

    println("\nProdutos e preços informados:")
    for ((nome, preco) in produtos) {
        println("$nome: R$ %.2f".format(preco))
    }

    if (produtos.isNotEmpty()) {
        val media = produtos.values.average()
        println("\nValor médio dos produtos: R$ %.2f".format(media))
    } else {
        println("Nenhum produto foi informado.")
    }

    val produtosOrdenados = produtos.toList().sortedBy { (_, preco) -> preco }

    println("\nProdutos ordenados por preço (em ordem crescente):")
    var index = 0
    while (index < produtosOrdenados.size) {
        val (nome, preco) = produtosOrdenados[index]
        println("$nome: R$ %.2f".format(preco))
        index++
    }
}

fun main() {
    // Chama a função para executar o loop
    fazerLooop()
}