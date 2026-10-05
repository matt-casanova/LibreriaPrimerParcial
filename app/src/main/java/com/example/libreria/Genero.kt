package com.example.libreria

sealed interface Genero {
    data object Ficcion : Genero
    data object NoFiccion : Genero
    data object Educativo : Genero
}
