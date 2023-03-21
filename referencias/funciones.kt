/*
== Funciones ==
Las funciones son bloques de codigo que pueden ser invocados al nombrar
una literal dentro de la ejecucion, estos bloques pueden trabajar con o sin datos
externos(parametros), al mismo tiempo, pueden devolver o no un valor.

Dato a considerar, al definir una funcion, los datos que se definen como externos
se llaman parametros, sin embargo, cuando se invoca la funcion esos datos externos se
llaman argumentos.

Existen dos tipos de funciones, funciones explicitas y anonimas
- Las funciones explicitas son aquellas que se definen en un bloque fuera de la funcion
principal(main)
- Las funciones anonimas son aquellas que son definidas como una variable y
pueden ser definididas dentro de la funcion principal

Para mas informacion:
- https://kotlinlang.org/docs/functions.html
*/
fun saludoHumano(nombre : String) {
    println("Hola $nombre")
}


fun main(args : Array<String>) {
    val contadorCaracteres : (String) -> Int = {valor -> valor.length}

    val nombre : String = "Angel Molina"
    saludoHumano(nombre)
    println("Mi nombre tiene: ${contadorCaracteres(nombre)} caracteres")
}