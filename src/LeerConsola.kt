import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println("Ingresa un valor")

    val data = readLine()
    var temp = true

    var eval =try {
        val num = data?.toInt()
        println("El numero ingresado es $num")
    }catch (e: NumberFormatException){
        println("No ingresaste un numero ")
    }finally {
        temp = false
    }

    println(temp)


}