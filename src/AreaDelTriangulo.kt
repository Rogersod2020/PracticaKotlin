import java.util.*

fun main() {

    //Calculo del area de un triangulo
    var base: Int
    var altura: Int
    var area: Int

    val scanner = Scanner(System.`in`)

    println("Longitud de la base?")
    base = scanner.nextInt()

    println("altura del triangulo?")
    altura = scanner.nextInt()

    area = ((base*altura)/2)

    println("El area del triangulo es: $area")

}