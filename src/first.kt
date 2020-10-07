fun main() {
    hola()
}
fun hola(){
    var edad = 10
    //val edad:Int = 10
    val nombre:String = "Sebastian"
    val persona:Persona = Persona(nombre,edad)
    println("Mi edad actual es $edad")
    edad += 1
    println("Mi edad ahora es $edad pero mi edad antigua es ${persona.age}")
    val miCarro = Carro(5,"Rojo","Ford")
    print(miCarro.toString())

}


class Persona(name:String,val age:Int){
    private lateinit var myName:String
    init {
        myName = name
    }

    fun info(){
        println("""
            |Nombre
            |$myName
            |Edad
            |$age
        """.trimIndent()) //Para que no imprima los pipes,
    }
}