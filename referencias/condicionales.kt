/*
Los condicionales son estructuras de control que nos permiten ejecutar n numeros de lineas
de codigo si la evaluacion de una condicion es verdadera.

Hay dos estructuras que nos permiten evaluar condiciones:
- if
- when(similar a switch case)

Para mas informacion:
- https://kotlinlang.org/docs/coding-conventions.html#conditional-statements
*/
fun main(args : Array<String>) {
    val edad : Int = 20
    if (edad > 18 && edad <= 100) {
        println("Mayor de edad.")
    } else if (edad > 0 && edad <= 17 ){
        println("Menor de edad.")
    } else {
        println("Error en la edad")
    }
    print("\n")
    val nombreUsuario = "Angel Molina"
    if (nombreUsuario.isNotEmpty()) {
        println("Nombre existe")
    } else {
        println("sin valor en la variable nombre")
    }
    print("\n")
    val esConMayus : Boolean = true
    val nombreActualizado = if (esConMayus) {
        nombreUsuario.toUpperCase()
    } else {
        nombreUsuario
    }
    println(nombreActualizado)
    println("\n")
    val responseCode = 200
    val status = if(responseCode == 200) "PASS" else "FAIL"
    println(status.toLowerCase())
    println("\n")
    val diaActual = "Lunes"
    when(diaActual.toLowerCase()) {
        "lunes" -> println("Apenas inicia la semana :c")
        "martes" -> println("Segundo dia, vamos!")
        "miercoles" -> println("Ombligo de semana B)")
        "jueves" -> println("Ya casi!!!!")
        "viernes" -> println("Al fiiiiiin!")
        "sabado" -> println("Primer dia de descansa :D")
        "domingo" -> {
            println("Ultimo dia de descanso T_T")
            println("Pero si apenas abri me recoste a descansar :c")
        }
    }
    val numeroMes = 6
    when(numeroMes) {
        in 1..6 -> println("primeros 6 meses!")
        in 7..12 -> println("ultimos 6 meses!")
    }
    val irALaEscuela = when(diaActual.toLowerCase()) {
        "sabado", "domingo" -> false
        else -> true
    }
    println("Debo ir a la escuela? $irALaEscuela")
}