package com.example.libreria

interface Producto {
    val id: String
    val titulo: String
    val precio: Double
    var stock: Int

    fun obtenerDescripcion(): String
    fun precioConIva(): Double
}
