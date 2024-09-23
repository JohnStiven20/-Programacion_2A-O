package modelo

import java.util.Date

enum class EstadoPedido{PEDIENTE, ENTREGADO, CANCELADO}

data class PedidoDTO (

    var fehca:Date,
    var precioTotal:Float,
    var estado:EstadoPedido,
    var listaLineasPedididos:MutableList<LineaPedido> = mutableListOf()

) {

    fun agregarLineaPedido(cantidad:Int) {
        var lineaPedido = LineaPedido(cantidad)
        listaLineasPedididos.add(lineaPedido)
    }
}