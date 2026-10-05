package com.example.libreria

class Libro(
    override val id: String,
    override val titulo: String,
    override val precio: Double,
    override var stock: Int,
    val autor: String,
    val genero: Genero
) : Producto {
    override fun obtenerDescripcion(): String {
        return "Libro: $titulo, Autor: $autor (Género: ${genero.javaClass.simpleName})"
    }

    override fun precioConIva(): Double {
        return precio * 1.21 // Suponiendo un IVA del 21%
    }
}
