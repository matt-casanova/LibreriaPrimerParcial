package com.example.libreria

class Revista(
    override val id: String,
    override val titulo: String,
    override val precio: Double,
    override var stock: Int,
    val numeroEdicion: Int
) : Producto {
    override fun obtenerDescripcion(): String {
        return "Revista: $titulo, Edición: $numeroEdicion"
    }

    override fun precioConIva(): Double {
        return precio * 1.21 // Suponiendo un IVA del 21%
    }
}
