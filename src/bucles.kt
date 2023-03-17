/*
Los bucles son estructura de control que nos permiten repetir
n numeros de linea de codigo n numero de veces, es posible utilizar
las siguientes estructuras de control:
- for
- for in (for each)
- while
- do while

Para mas informacion:
- https://kotlinlang.org/docs/coding-conventions.html#loops-on-ranges
- https://kotlinlang.org/docs/control-flow.html#while-loops
- https://kotlinlang.org/docs/returns.html#break-and-continue-labels
*/
fun main(args : Array<String>){
    var contador = 10
    while(contador >= 0) {
        println("Contador -> $contador\n")
        contador--
    }
    do {
        var num_random = (0..100).random()
        println("Numero Aleatorio::$num_random")
    } while(num_random > 50)
    val list_frutas = listOf("pera", "manazana", "durazno")
    for (fruta in list_frutas){
        println("Frutero :: ${fruta.toUpperCase()}")
    }
    for (iterator in 0 until 20){
        println("Iteracion:: $iterator")
    }
}