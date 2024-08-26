/*
*  Calcular a média de uma sequência de números positivos informados pelo usuário
*  Instruções: declarar variáveis; inicializar variáveis; enquanto número maior que 0 faça:
*   receber número do usuário; somar ao total; incrementar 1 ao contador;
*  Ao sair do loop calcular a média; apresentar o contador; apresentar o valor total; apresentar a média
 */

fun main(){
    calcularMediaWhile()
}

fun calcularMediaWhile() {
    var numero: Float = 0.0F
    var media: Float = 0.0F
    var numeroTotal: Float = 0.0F
    var contador: Int = 0

    while (numero >= 0){

        println("Digite um numero maior que 0")
        numero = readln().toFloat()

        if (numero >= 0){
            numeroTotal += numero;

            contador += 1
        } else {
            println("Finalizado")
        }
    }

    media = (numeroTotal/contador).toFloat()

    println("Média dos números: ${media}, Números Selecionados: ${contador}, Total: ${numeroTotal}.")
}