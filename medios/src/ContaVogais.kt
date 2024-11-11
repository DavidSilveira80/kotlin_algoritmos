fun main() {
    val palavra = readln()
    var somaVogais = 0
    for(letra in palavra){
        if(letra in "aeiouAEIOU"){
            somaVogais += 1
        }
    }
    println(somaVogais)
}