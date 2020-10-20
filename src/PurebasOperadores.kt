import java.util.*

fun main() {

    //Objeto que escana el teclado
    val scanner = Scanner(System.`in`)

    val a: Int
    val b: Int

    println("Escribe tu primer numero")
    a= scanner.nextInt()

    println("Escribe el segundo numero")
    b= scanner.nextInt()

    println("La suma de $a + $b = " + (a+b))

    println("La resta de $a - $b = " + (a - b))

}