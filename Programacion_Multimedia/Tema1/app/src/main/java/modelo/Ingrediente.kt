package modelo

data class Ingrediente(

    var nombre:String,
    var listaAlergenos:MutableList<String> = mutableListOf()

) {

    fun agregarAlergeno(alergeno: String) {
        listaAlergenos.add(alergeno)
    }

}