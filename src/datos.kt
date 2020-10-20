import java.util.*

fun main() {

    val email:String
    val edad:Int

    val scanner = Scanner(System.`in`)

    println("Escribe tu correo")
    email = scanner.next()

    println("Escribe tu edad")
    edad = scanner.nextInt()

    println("Tu correo es: $email")
    println("Tu edad es: $edad")

}