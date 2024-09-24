package modelo

class LineaPedidoDTO(

    var cantidad:Int,
    var pizzaDTO: PizzaDTO? = null,
    var pastaDTO: PastaDTO? = null,
    var bebidaDTO: BebidaDTO? = null

) {

    override fun toString(): String {

        if (pizzaDTO != null) {
            return "LineaPedidoDTO(cantidad=$cantidad, pizzaDTO=$pizzaDTO)"
        }  else if (pastaDTO != null) {
            return "LineaPedidoDTO(cantidad=$cantidad, pastaDTO=$pastaDTO"
        } else {
            return "LineaPedidoDTO(cantidad=$cantidad, bebidaDTO=$bebidaDTO)"
        }

    }
}