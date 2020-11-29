class estudiante(nombre:String, apellido:String, var asignatura: String, var profesor: String):
Persona(nombre,apellido)
open class Persona(var nombre:String, var apellido:String)
fun main()
{
    var estudiante= estudiante("César","López","Desarrollo","Maistro yesser")
    println("Asignatura: ${estudiante.asignatura} con ${estudiante.profesor}")
}