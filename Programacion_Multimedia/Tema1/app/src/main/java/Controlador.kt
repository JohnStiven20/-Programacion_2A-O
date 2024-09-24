import modelo.IngredienteDTO
import modelo.PizzaDTO
import modelo.Tipo

class Controlador {

fun filtradoPizzas(list: List<PizzaDTO>):List<PizzaDTO> = list.filter {it.precio in 7.0 .. 10.0}

fun filtradoIngredientes(producto:PizzaDTO):List<IngredienteDTO> = producto.listaIngrediente.filter {it.listaAlergenos.isEmpty()}

fun  ordenarPizzasPrecio(list: List<PizzaDTO>, tipo: Tipo):List<PizzaDTO> = if (Tipo.DESCENTE == tipo) list.sortedByDescending { it.precio } else list.sortedBy {it.precio}

fun contadorPizzas(list: List<PizzaDTO>, ingredienteDTO: IngredienteDTO):Int = list.filter { it -> it.listaIngrediente.any {it.nombre == ingredienteDTO.nombre }}.count() }