
//Aqui função main é principal so pode fazer teste Run
fun main() {

   calcular() //função main vai entrar funçaõ calcular e mostrar o resultado
}
    fun calcular(){

        val ano = 12
        val diasAno = 365
        val mesDias = 30
        val dia = 24
        val minutos = 60
        var teclado = 0
        println("Digite anos quer receber o resultados de transformação mês, minutos e segundos")
        teclado = readln().toInt()

        var calcularMes = teclado * ano
        var calcularDias = calcularMes * mesDias
        var calcularHoras = calcularDias * dia
        var calcularMinutos = calcularHoras * minutos
        var calcularSegundos = calcularMinutos * minutos

        println(calcularMes)
        println(calcularDias)
        println(calcularHoras)
        println(calcularMinutos)
        println(calcularSegundos)

    }
