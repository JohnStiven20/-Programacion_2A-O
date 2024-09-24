import modelo.BebidaDTO
import modelo.ClienteDTO
import modelo.EstadoPedido
import modelo.IngredienteDTO
import modelo.LineaPedidoDTO
import modelo.PastaDTO
import modelo.PedidoDTO
import modelo.PizzaDTO
import modelo.Size
import modelo.Tipo
import java.util.Date


fun main() {


  var listaLineasPedido:MutableList<LineaPedidoDTO> = mutableListOf()

  var pedido = PedidoDTO(Date(), 78F, estado = EstadoPedido.PEDIENTE, listaLineasPedido)

  var lineaPedido = LineaPedidoDTO(10,pastaDTO = PastaDTO("CUATRO QUESO", precio = 10.3))
  var lineaPedido2 = LineaPedidoDTO(5, bebidaDTO = BebidaDTO("COCA COLA", precio = 3.3,Size.MEDIANO))

  lineaPedido.pastaDTO?.listaIngrediente?.forEach {println(it)}
  println(lineaPedido2.bebidaDTO)

  listaLineasPedido.add(lineaPedido)
  listaLineasPedido.add(lineaPedido2)

  /**
   *
   *---------------------------------------------------------------------------------
   *
   */


  var controlador = Controlador()

  var listaPizzaDTOS:MutableList<PizzaDTO> = mutableListOf()

  var pizzaDTO1 = PizzaDTO(nombre = "Stiven", precio = 5.0, Size.GRANDE)
  var pizzaDTO2 = PizzaDTO(nombre = "Cris", precio = 7.1,Size.MEDIANO)
  var pizzaDTO3 = PizzaDTO(nombre = "Paco", precio = 9.4, Size.PEQUEÑO)

  listaPizzaDTOS.add(pizzaDTO1)
  listaPizzaDTOS.add(pizzaDTO2)
  listaPizzaDTOS.add(pizzaDTO3)

  println("------------------------------------------------------------------------------------")

  var nuevaListaFiltradaPrecio = controlador.filtradoPizzas(listaPizzaDTOS)
  nuevaListaFiltradaPrecio.forEach {println(it)}

  println("------------------------------------------------------------------------------------")

  var listaIngrediente = controlador.filtradoIngredientes(pizzaDTO1)
  listaIngrediente.forEach { println(it) }

  println("------------------------------------------------------------------------------------")

  val ordenarDescendente: (List<PizzaDTO>) -> List<PizzaDTO> = { pizzas ->
    pizzas.sortedByDescending{it.precio
    }
  }
  var listaOrdena =  controlador.ordenarPizzasPrecio(listaPizzaDTOS,Tipo.DESCENTE)
  listaOrdena.forEach {println(it)}

  println("------------------------------------------------------------------------------------")

  var ingredienteDTO = IngredienteDTO(nombre = "Pasta")
  var numeroContador = controlador.contadorPizzas(listaPizzaDTOS, ingredienteDTO)
  println(numeroContador)

  println("------------------------------------------------------------------------------------")

}