package Exercicio04


fun main() {

    conversao()
}

fun conversao(){
    println("Digite um valor de milhas: ")
    var milhas = readln().toDouble()

    var calcula = milhas * 1.6
    println("Valor você digitou é $milhas conversão para o valor Km é: $calcula KM")
}
