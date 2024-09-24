package modelo

data class PizzaDTO (

    var nombre:String,
    var precio:Double,
    var size: Size?,
    var listaIngrediente: MutableList<IngredienteDTO> = mutableListOf(

        IngredienteDTO("Queso", mutableListOf("Leche")),
        IngredienteDTO("Tomate", mutableListOf("Glucosa")),
        IngredienteDTO("Pasta", mutableListOf("Sulfitos")),
        IngredienteDTO("Salsa", mutableListOf())

    )

) {

    fun  agregarIngrediente(nombre:String) {

        var ingredienteDTO = IngredienteDTO(nombre)
        listaIngrediente.add(ingredienteDTO)
    }

}
