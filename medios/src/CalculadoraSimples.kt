fun soma(numeroA: Int, numeroB: Int): Int{
    return numeroA + numeroB
}

fun subtracao(numeroA: Int, numeroB: Int): Int{
    return numeroA - numeroB
}

fun multiplicacao(numeroA: Int, numeroB: Int): Int{
    return numeroA * numeroB
}

fun divisao(numeroA: Int, numeroB: Int): Int {
    var result = 0
    if (numeroB > 0 || numeroB < 0) {
        result = numeroA / numeroB

    }else{
        result = 0
    }
    return result
}

fun main(){
    val numeroA = readln().toInt()
    val numeroB = readln().toInt()
    println("ENTRE COM A OPERAÇÃO -> +-*/ ")
    val operacao = readln()

    if(operacao == "+"){
        println("SOMA")
        println(soma(numeroA, numeroB))
    }else if(operacao == "-"){
        println("SUBTRAÇÃO")
        println(subtracao(numeroA, numeroB))
    }else if(operacao == "*"){
        println("MULTIPLICAÇÃO")
        println(multiplicacao(numeroA, numeroB))
    }else{

        println("DIVISÃO")
        val result = divisao(numeroA, numeroB)
        if(result == 0){
            println("Divisão por Zero é impossível")
        }else{
            println(result)
        }
    }
}
