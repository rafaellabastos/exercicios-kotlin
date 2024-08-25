/*
--Questão 1--
Implementar um programa que o usuário informe via linha de comando um valor do produto e um percentual
de desconto. Com base nisso apresente o valor final do produto. Criar uma função para esse cálculo.
*/


import java.util.Scanner

fun calcularValorFinal(valorProduto: Double, percentualDesconto: Double): Double {
    val desconto = valorProduto * percentualDesconto / 100
    return valorProduto - desconto
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Valor do produto: R$ ")
    val valorProduto = scanner.nextDouble()

    print("Percentual de desconto: ")
    val percentualDesconto = scanner.nextDouble()

    val valorFinal = calcularValorFinal(valorProduto, percentualDesconto)

    println("O valor final do produto com desconto é: R$%.2f".format(valorFinal))
}