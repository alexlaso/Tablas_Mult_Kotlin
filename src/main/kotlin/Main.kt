fun main() {
    val intervaloTabla = 1..10
    println("Por favor introduce el primer número del intevalo")
    val num1: Int = readln().toInt()
    println("Por favor introduce el segundo número del intevalo")
    val num2: Int = readln().toInt()
    val max: Int?
    val min: Int?
    if (num1 > num2) {
        max = num1
    } else {
        max=num2
    }
    if (num1 < num2) {
        min = num1
    }else{
        min= num2
    }
    var indice: Int = num1
    val valoresRecibidos = min..max

    for (indice in valoresRecibidos){
        println("Multiplos de $indice: ")
        for (i in 1..10){
        val resultado = indice * i
        print("$resultado ")
    }
        println()
    }

}