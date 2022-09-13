fun main() {
    val intervaloTabla = 1..10
    println("Por favor introduce el número mínimo del intevalo")
    val num1: Int = readln().toInt()
    var indice: Int = num1
    println("Por favor introduce el número máximo del intevalo")
    val num2: Int = readln().toInt()
    println("El menor es $num1 y el mayor es $num2")
    val valoresRecibidos = num1..num2

    for (indice in valoresRecibidos){
        println("Multiplos de $indice: ")
        for (i in 1..10){
        val resultado = indice * i
        print("$resultado ")
    }
        println()
    }

}