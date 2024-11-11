fun celsiusFahrenheit(celsius: Int): Double{
    return celsius * 1.8 + 32
}

fun fahrenheitCelsius(fahrenheit: Double): Double{
    return (5.0 / 9) * (fahrenheit - 32)
}

fun main(){
    println("INFORME E TEMPERATURA EM CELSIUS")
    val celsius = readln().toInt()

    println("CELSIUS PARA FAHRENHEIT")
    println(celsiusFahrenheit(celsius))
    val fahrenheit = celsiusFahrenheit(celsius)
    println()
    println("FAHRENHEIT PARA CELSIUS")
    println(fahrenheitCelsius(fahrenheit))
}

