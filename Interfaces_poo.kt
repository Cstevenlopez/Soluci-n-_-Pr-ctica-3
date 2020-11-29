interface Forma {
    fun area(): Double
    fun printName();
}
class Circulo(val nombre: String, val radio: Double):
Forma {
    override fun area()= Math.PI * Math.pow(radio, 2.0)
    override fun printName(){}
}
fun main(){
    val Circulo= Circulo("Circulo",4.0)
    println(Circulo.nombre)
    println(Circulo.radio)
    println(Circulo.area())
}