package com.example.libreria

class Venta(
    val id: String,
    val fecha: String,
    val cliente: String,
    val productos: List<Producto>
) {
    fun calcularTotal(): Double {
        // Se calcula el total sumando el precio con IVA de cada producto en la venta
        return productos.sumOf { it.precioConIva() }
    }
}
