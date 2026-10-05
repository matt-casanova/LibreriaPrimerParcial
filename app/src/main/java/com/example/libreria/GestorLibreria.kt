package com.example.libreria

class GestorLibreria {
    // Listas privadas como lo indica el diagrama (simbolo '-')
    private val inventario: MutableList<Producto> = mutableListOf()
    private val ventas: MutableList<Venta> = mutableListOf()

    fun agregarProducto(producto: Producto) {
        inventario.add(producto)
    }

    fun listarTodosLosProductos(): List<Producto> {
        return inventario.toList()
    }

    fun filtrarLibrosPorGenero(genero: Genero): List<Libro> {
        return inventario
            .filterIsInstance<Libro>()
            .filter { it.genero == genero }
    }

    fun buscarPorTitulo(titulo: String): List<Producto> {
        return inventario.filter { 
            it.titulo.contains(titulo, ignoreCase = true) 
        }
    }

    fun calcularValorInventario(): Double {
        // Multiplica el precio base por el stock de cada producto
        return inventario.sumOf { it.precio * it.stock }
    }

    fun registrarVenta(venta: Venta) {
        // Guardamos la venta
        ventas.add(venta)
        
        // Descontar el stock de los productos vendidos
        venta.productos.forEach { productoVendido ->
            val producto = inventario.find { it.id == productoVendido.id }
            if (producto != null && producto.stock > 0) {
                producto.stock -= 1
            }
        }
    }
}
