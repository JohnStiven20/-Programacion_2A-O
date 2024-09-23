package modelo

data class LineaPedido(

    var cantidad:Int,
    var listaPizzas:MutableList<Pizza> = mutableListOf(),
    var listaPastas:MutableList<Pasta> = mutableListOf(),
    var listaBebidas:MutableList<Bebida> = mutableListOf()

) {

    fun agregarPizza(nombre:String, precio:Double, tamaño:Size):Pizza{

        var pizza = Pizza(nombre,precio,tamaño)
        return pizza
    }

}