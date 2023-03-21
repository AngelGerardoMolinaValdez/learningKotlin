/*
== Variables ==
Las variables son valores que reservan espacio en la memoria
y esto nos permite utilizar ese valor almacenado posteriormente
utlizando una palabra literal como un identificador del mismo
valor.

En Kotlin es posible definir variables de 3 formas:
- Variables mutables, es decir que es posible modificar n veces (var)
- Variables inmutables, es decir variables que solo es posible asignar
una vez un valor.
- Valores Constantes, aquellos valores que una vez modificados ya no
es posible modificar el valor

Entonces, cual es la diferencia entre 'val' y 'const'?
La diferencia se encuentra en la forma de asignar el valor.
'const' asigna el valor durante la compilacion y los valores con
'val' se puede asignar durante la ejecucion.

Ejemplo:
>>> const val constante  = functionExample() //No esta bien
>>> val valorInmutable   = functionExample() //Esta bien
>>> const val constante2 = "Hello world" //Tambien esta bien

Por ultimo agregar que el convention naming para variables es camel case (myVar, nameUser, destroyWorld, etc)

== Tipos de datos ==
Los datos mas comunes en kotlin son los siguientes:
- Numbers and their unsigned counterparts: Numeros enteros y decimales
- Booleans: valores logicos true o false
- Characters: caracteres
- Strings: listas de caracteres
- Arrays: colecciones de datos

Para mas informacion sobre tipos de datos consultar:
- https://kotlinlang.org/docs/basic-types.html
- https://kotlinlang.org/docs/collections-overview.html#list

Acerca de la interpolacion o string templates (formato a los strings) consultar documentacion:
- https://kotlinlang.org/docs/strings.html#string-templates

Sobre naming convention de Kotlin:
- https://kotlinlang.org/docs/coding-conventions.html
*/
fun main(args : Array<String>) {
    // == Ejemplo variables ==
    var edadUsuario : Int = 20
    edadUsuario = 22
    val nombreUsuario : String = "Angel Gerardo"
    val apellidosUsuario : String = "Molina Valdez"
    val nombreCompleto = "$nombreUsuario $apellidosUsuario"

    // == Tipos de datos ==
    val tipoNumericoEntero : Int = 23
    val tipoNumericoDecimal : Float = 23.3f
    val tipoLogicoVerdadero : Boolean = true
    val tipoLogicoFalso : Boolean = false
    val primerInicial : Char = 'A'
    val estadoNacimiento : String = "Estado de Mexico"
    // [4, 4, 4, 4]
    val calificaciones : Array<Int> = arrayOf(1, 2, 3, 4)
    val frutas : List<String> = listOf("Pera", "Manzana", "Banana")
    val edades : Map<String, Int> = mapOf("Angel Molina" to 23, "Pedro Picapiedra" to 56)

    var valorNull = null
}
