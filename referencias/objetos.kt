/*
== Objetos ==
Los objetos son la instancia de una clase... Pero que es una clase?

Una clase es una estructura que contiene atributos(variables con informacion de la misma clase)
y metodos(funciones que pueden o no compartir datos entre los mismos), y es la base de un
objeto, es decir, antes de instanciarlo(guardar la clase en una variable o en otras palabras
declarar una variable con la clase hecha) ya existe toda la estructura, pero solo es posible
acceder a esta estructura con la instancia del mismo objeto.

Para mas informacion consultar:
- https://kotlinlang.org/docs/classes.html
*/
class Persona(var nombre : String) {

    fun hablar(oraciones : List<String>) {
        oraciones.forEach{oracion -> println("$nombre >>> $oracion")}
    }
}


class Empleado constructor(var idEmpleado : Int) {

    fun horaEntrada() {
        print("Entro por la tarde!!")
    }
}


fun main(args : Array<String>) {
    val miPersona = Persona("Angel Molina")
    miPersona.hablar(listOf("Hola?", "Me escuchan?"))
    val miEmpleado = Empleado(1)
    miEmpleado.horaEntrada()
}
