package modelo

data class PastaDTO(

    var nombre:String,
    var precio:Double,
    var listaIngrediente: MutableList<IngredienteDTO> = mutableListOf(

        IngredienteDTO("Pan", mutableListOf("Leche")),
        IngredienteDTO("macarrones", mutableListOf()),
        IngredienteDTO("glucosa", mutableListOf("Sulfitos"))
    )
) {

    fun agregarIngredientes(nombre: String) {
        var ingredienteDTO = IngredienteDTO(nombre)
        listaIngrediente.add(ingredienteDTO)
    }

}
