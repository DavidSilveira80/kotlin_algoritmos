fun main(){
    val numero = readln().toInt()

    if(numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0){
        println("Número $numero não é primo")

    }else{
        println("Número $numero é primo")
    }

}