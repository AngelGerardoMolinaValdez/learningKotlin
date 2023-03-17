/*
@author: Angel Gerardo Molina Valdez
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

Para mas informacion sobre tipos de datos consultar:
- https://kotlinlang.org/docs/basic-types.html

Acerca de la interpolacion o string templates (formato a los strings) consultar documentacion:
- https://kotlinlang.org/docs/strings.html#string-templates
*/
fun main(args : Array<String>) {
    var edadUsuario : Int = 20
    edadUsuario = 22
    println("La edad que tengo es de: $edadUsuario anios\n")
    val planetaUsuario : String = "Tierra"
    println("Vivo en el planeta: $planetaUsuario \n")
    val inicialUsuario : Char = 'A'
    println("La inicial de mi nombre es $inicialUsuario\n")
    val nombreUsuario : String = "Angel Gerardo"
    val apellidosUsuario : String = "Molina Valdez"
    val nombreCompleto = "$nombreUsuario $apellidosUsuario"
    println("Nombre completo:\t\t$nombreCompleto")
}
