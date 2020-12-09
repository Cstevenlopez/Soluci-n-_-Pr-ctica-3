class Universidad(var recinto:String, var direccion:String, var personas:ArrayList<Persona>)

open class Persona(var nombre:String, var apellido:String,var cedula:String,var edad:Int)

class Profesores(nombre:String, apellido:String, cedula:String, edad:Int,var facultad:String, var cantAsg:Int) : Persona(nombre,apellido,cedula,edad)

class Estudiante(nombre:String, apellido:String, cedula:String, edad:Int, var nivelE:String, var prof_Rep:String) :  Persona(nombre,apellido,cedula,edad)

class Administrativos(nombre:String, apellido:String, cedula:String, edad:Int,var area:String, var jefe:String) : Persona(nombre,apellido,cedula,edad)


fun main(args: Array<String>) {
    
    var lista_personas = ArrayList<Persona>()
    var persona = Persona("Juan","Lopez","615171009827",22)
    var estudiante = Estudiante("Pedro","Garcia","7272727271",22,"IV","Faruck")
    var profesor = Profesores("Anastacio","Garcia","7272727271",22,"TECNOLOGIA",2)
    var admin = Administrativos("Henry","Garcia","7272727271",22,"Contabilidad","Geronimo")
    
    lista_personas.add(persona)
    lista_personas.add(estudiante)
    lista_personas.add(profesor)
    lista_personas.add(admin)
    
    
    var universidad = Universidad("Las minas","Siuna",lista_personas)
    
     for(i in universidad.personas){
         println(i.nombre)
     }
}