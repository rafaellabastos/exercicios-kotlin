/*
*  --Questão 8--
*  Desenvolva duas classes na qual as mesmas herdem pelo menos dois atributos ou dois métodos da superclasse, em
*  seguida instancie 03 objetos de cada classe e realize a exibição no terminal
 */

open class Produto(
    val nome: String,
    val preco: Double
) {
    open fun exibirInformacoes() {
        println("Nome: $nome")
        println("Preço: R$ %.2f".format(preco))
    }

    open fun aplicarDesconto(percentual: Double) {
        val desconto = preco * percentual / 100
        println("Desconto aplicado: R$ %.2f".format(desconto))
    }
}

class Eletronico(
    nome: String,
    preco: Double,
    val garantia: Int
) : Produto(nome, preco) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Garantia: $garantia anos")
    }
}

class Roupas(
    nome: String,
    preco: Double,
    val tamanho: String
) : Produto(nome, preco) {

    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Tamanho: $tamanho")
    }
}

fun main() {
    val eletronico1 = Eletronico("Celular", 2101.00, 2)
    val eletronico2 = Eletronico("Notebook", 4999.99, 1)
    val eletronico3 = Eletronico("Televisão", 1999.99, 3)

    val roupa1 = Roupas("Cropped", 79.90, "M")
    val roupa2 = Roupas("Calça Jeans", 159.90, "G")
    val roupa3 = Roupas("Jaqueta de couro", 249.90, "P")

    println("Informações dos Eletrônicos:")
    eletronico1.exibirInformacoes()
    println()
    eletronico2.exibirInformacoes()
    println()
    eletronico3.exibirInformacoes()
    println()

    println("Informações das Roupas:")
    roupa1.exibirInformacoes()
    println()
    roupa2.exibirInformacoes()
    println()
    roupa3.exibirInformacoes()
}