package modelo

data class Pizza (

    var nombre:String,
    var precio:Double,
    var size: Size,
    var listaIngrediente: MutableList<Ingrediente> = mutableListOf()
) {

    fun  agregarIngrediente(nombre:String) {

        var ingrediente = Ingrediente(nombre)
        listaIngrediente.add(ingrediente)
    }

}
