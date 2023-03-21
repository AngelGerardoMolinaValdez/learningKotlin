/*
Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros),
calcule el índice de masa corporal y lo almacene en una variable, y muestre por
pantalla la frase Tu índice de masa corporal es <imc> donde <imc> es el índice
de masa corporal calculado redondeado con dos decimales.

Fórmula: peso (kg) / [estatura (m)]2

- https://www.cdc.gov/healthyweight/spanish/assessing/bmi/adult_bmi/index.html#:~:text=%C2%BFC%C3%B3mo%20se%20calcula%20el%20IMC%3F,-El%20IMC%20se&text=Con%20el%20sistema%20m%C3%A9trico%2C%20la,obtener%20la%20estatura%20en%20metros.
*/
import java.util.Scanner


fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    print(">>> Peso(kg): ")
    val peso = scanner.nextFloat()
    print("\n>>> Estatura(mts): ")
    val estatura = scanner.nextFloat()
    if(peso < 1 || estatura < 0) {
        println("El peso debe ser mayor a 0 kgs y la estatura mayor a 0 mts")
        return
    }
    val indiceMasaCorporal = peso / (estatura * estatura)
    println("Tu indice de masa corporal es: $indiceMasaCorporal")
}