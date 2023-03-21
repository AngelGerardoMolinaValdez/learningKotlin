/*
Escribir un programa que pregunte al
usuario por el número de horas trabajadas y el coste por hora. 
Después debe mostrar por pantalla la paga que le corresponde.

https://aprendeconalf.es/docencia/python/ejercicios/tipos-datos/#ejercicio-5
*/
import java.util.Scanner


fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    print(">>> Horas laboradas: ")
    val horasTrabajadas : Float = scanner.nextFloat()
    print("\n>>> Coste de hora: ")
    val costeHora : Float = scanner.nextFloat()
    val totalPago : Float = horasTrabajadas * costeHora
    println("\n>>> Total a pagar: \$$totalPago")
}
