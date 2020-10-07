import kotlin.random.Random

data class Carro (
    val numPuertas:Int,
    val color: String,
    val marca : String = "Ford"
){

    val value = 1

    val sameValue: Int
        get() = value * Random(20).nextInt()
}