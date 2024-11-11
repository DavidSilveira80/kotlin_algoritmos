fun main(){
    var soma = 0
    var divisor = 0
    val numeros = listOf(45, 5, 10, 20, 25)
    for(numero in numeros){
        soma += numero
        divisor += 1
    }
    println(soma / divisor)
    //OU
    println(numeros.sum() / numeros.size)
}