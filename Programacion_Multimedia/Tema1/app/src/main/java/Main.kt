import modelo.ClienteDTO
import modelo.EstadoPedido
import modelo.Ingrediente
import modelo.PedidoDTO
import modelo.Pizza
import modelo.Size
import java.util.Date


fun main() {

  var cliente = ClienteDTO(nombre = "Stiven", dni = "48642965N", telefono = "602 381 142", direccion = "Travesi San Miguel de Salinas", email = "stivensolanomacas@gmail", password = "12456")

  var pedido = PedidoDTO(Date(), 78F, estado = EstadoPedido.PEDIENTE)

  pedido.agregarLineaPedido(50)

  var controlador = Controlador()

  var listaPizzas:MutableList<Pizza> = mutableListOf()

  var pizza1 = Pizza(nombre = "Stiven", precio = 5.0, Size.GRANDE)
  pizza1.agregarIngrediente("Pasta")
  pizza1.agregarIngrediente("Caracol")
  pizza1.agregarIngrediente("queso")
  pizza1.listaIngrediente[0].agregarAlergeno("Colesterol")
  pizza1.listaIngrediente[1].agregarAlergeno("Pan")
  var pizza2 = Pizza(nombre = "Cris", precio = 7.1,Size.MEDIANO)
  pizza2.agregarIngrediente("Cebolla")
  var pizza3 = Pizza(nombre = "Paco", precio = 9.4, Size.PEQUEÑO)
  pizza3.agregarIngrediente("Pasta")

  listaPizzas.add(pizza1)
  listaPizzas.add(pizza2)
  listaPizzas.add(pizza3)

  println("------------------------------------------------------------------------------------")

  var nuevaListaFiltradaPrecio = controlador.filtradoPizzas(listaPizzas)
  nuevaListaFiltradaPrecio.forEach {println(it)}

  println("------------------------------------------------------------------------------------")

  var listaIngrediente = controlador.filtradoIngredientes(pizza1)
  listaIngrediente.forEach { println(it) }

  println("------------------------------------------------------------------------------------")

  val ordenarDescendente: (List<Pizza>) -> List<Pizza> = { pizzas ->
    pizzas.sortedByDescending { it.precio }
  }
  var listaOrdena =  controlador.ordenarPizzasPrecio(listaPizzas,ordenarDescendente)
  listaOrdena.forEach { println(it) }


  println("------------------------------------------------------------------------------------")

  var ingrediente = Ingrediente(nombre = "Pasta")
  var numeroContador = controlador.contadorPizzas(listaPizzas, ingrediente)
  println(numeroContador)

  println("------------------------------------------------------------------------------------")









}