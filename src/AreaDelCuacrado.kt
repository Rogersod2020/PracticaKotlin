import java.util.*

fun main() {

    //Calculando el area y perimetro de un cuadrado
    var a: Int
    var perimetro: Int
    var area: Int

    val scanner = Scanner(System.`in`)

    println("Escribe lado del cuadrado")
    a= scanner.nextInt()
    perimetro = a * 4
    area = a * a

    println("El Perimetro del cuadrado es: $perimetro")
    println("y el Area del cuadrado es: $area")

}