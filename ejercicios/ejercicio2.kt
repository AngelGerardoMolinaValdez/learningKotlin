/*
Escribir un programa que lea un entero positivo, n,
introducido por el usuario y después muestre en pantalla
la suma de todos los enteros desde 1 hasta n. 
La suma de los primeros enteros positivos puede ser calculada de la siguiente forma:

suma = n(n+1) / 2

https://aprendeconalf.es/docencia/python/ejercicios/tipos-datos/#ejercicio-6
*/
import java.util.Scanner


fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    print(">>> Limite: ")
    val limite : Int = scanner.nextInt()
    if(limite < 0){
        println(">>> Se ha introducido un numero menor a 0.")
        return
    }
    val totalSumatoria : Int = limite * (limite + 1) / 2
    println(">>> La suma desde 1 hasta $limite es: $totalSumatoria")
}
