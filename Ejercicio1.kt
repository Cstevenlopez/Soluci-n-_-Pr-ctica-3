open class personas{
    open fun recorrer()
    {
        println("Soy una persona")
    }
}
class César:personas(){
    override fun recorrer(){
        println("Soy César")
    }
}
class Steven:personas(){
    override fun recorrer(){
        println("Soy Steven")
    }
}
class Eren:personas(){
    override fun recorrer(){
        println("Soy Eren")
    }
}
fun main(){
    var lista_personas= ArrayList<personas>()
    var César= César()
    var Steven= Steven()
    var Eren= Eren()
    lista_personas.add(César)
    lista_personas.add(Steven)
    lista_personas.add(Eren)
    for(per in lista_personas)
    {
            per.recorrer()
    }

}

