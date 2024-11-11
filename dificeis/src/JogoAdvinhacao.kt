fun main() {
    val range = 1..100
    val lista100 = range.toList()
    val numeroSoreteado = lista100.random()
    println(numeroSoreteado)
    do{
        println("Escolha seu número da sorte")
        var numero = readln().toInt()
        println()
        if(numero < numeroSoreteado){
            println("O número sorteado é maior")
            println("Tente Novamente")
        }else if(numero > numeroSoreteado){
            println("O número sorteado é menor")
            println("Tente Novamente")
        }
    }while(numero != numeroSoreteado)
    println("PARABÉNS VOCÊ ACERTOU O NÚMERO SORTEADO")
}
