import java.util.*

fun main() {

    //Seleccion de dos variables

    var a: Int
    var b: Int

    val scanner = Scanner(System.`in`)

    println("Escribe la primera Variable")
    a= scanner.nextInt()

    println("Escribe la segunda variable")
    b= scanner.nextInt()

    println("$a + $b = " + (a+b))
    println("$a - $b = " + (a-b))
    println("$a x $b = " + (a*b))
    println("$a / $b = " + (a/b).toDouble())

}