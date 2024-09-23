import modelo.Ingrediente
import modelo.Pizza

class Controlador {

fun filtradoPizzas(list: List<Pizza>):List<Pizza> = list.filter {it.precio in 7.0 .. 10.0}.toList()

fun filtradoIngredientes(producto:Pizza):List<Ingrediente> = producto.listaIngrediente.filter {it.listaAlergenos.isEmpty()}

fun  ordenarPizzasPrecio(list: List<Pizza>, operador: (List<Pizza>) -> List<Pizza>):List<Pizza> {
    return operador(list)
}

fun contadorPizzas(list: List<Pizza>, ingrediente: Ingrediente):Int = list.filter {it -> it.listaIngrediente.any {it.nombre == ingrediente.nombre }}.count()


}