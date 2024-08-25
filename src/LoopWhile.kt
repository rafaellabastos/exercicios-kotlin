/*
* --Questão 2--
* Novamente via linha de comando, o usuário deverá informar valores dentro de um loop e deverá ser apresentado o total
* no final. Esse loop deve usar while até que o usuário informe um valor zero para sair do loop.
* */

fun main() {
    var total = 0.0

    while (true) {
        print("Digite um valor (ou 0 para sair): ")
        val entrada = readLine()?.toDoubleOrNull()

        if (entrada == null) {
            println("Insira um número válido.")
            continue
        }

        if (entrada == 0.0) {
            break
        }

        total += entrada
    }

    println("O total dos valores informados é: %.2f".format(total))
}