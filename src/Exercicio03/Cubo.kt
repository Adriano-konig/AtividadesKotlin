package Exercicio03


fun main() {
    var n = 0.0

    println("Qual valor para fazer calculo de cubo?")
    n = readln().toDouble()
    calcularCubo(n)

}

fun calcularCubo(n:Double){

    var calcular = n * n * n
    println("valor cubo é: $calcular" )
}
