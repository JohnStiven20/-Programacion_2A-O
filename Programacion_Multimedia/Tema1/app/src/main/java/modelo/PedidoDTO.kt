package modelo

import java.util.Date

enum class EstadoPedido{PEDIENTE, ENTREGADO, CANCELADO}

class PedidoDTO (

    var fehca:Date,
    var precioTotal:Float,
    var estado:EstadoPedido,
    var listaLineasPedididos:MutableList<LineaPedidoDTO> = mutableListOf()

) {

    fun agregarLineaPedido(cantidad:Int, nombre:String, precio:Double, size: Size?, opcion:String) {

//        if (opcion.equals("1"))  {
//            var pizzaDTO = PizzaDTO(nombre,precio,size)
//            listaLineasPedididos.add(pizzaDTO)
//        } else if (opcion.equals("2")) {
//            var pastaDTO = PastaDTO(nombre,precio)
//            var lineaPedididos1 = LineaPedidoDTO(cantidad,null,pastaDTO)
//            listaLineasPedididos.add(lineaPedididos1)
//        } else {
//            var bebidaDTO = BebidaDTO(nombre,precio,size)
//            var lineaPedididos2 = LineaPedidoDTO(cantidad, null,null, bebidaDTO)
//            listaLineasPedididos.add(lineaPedididos2)
//        }

    }
}