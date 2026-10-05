package com.example.libreria

object DatosPrueba {
    val libros = listOf(
        Libro(id = "L1", titulo = "1984", precio = 15.0, stock = 10, autor = "George Orwell", genero = Genero.Ficcion),
        Libro(id = "L2", titulo = "Clean Code", precio = 45.0, stock = 5, autor = "Robert C. Martin", genero = Genero.Educativo),
        Libro(id = "L3", titulo = "Sapiens", precio = 20.0, stock = 8, autor = "Yuval Noah Harari", genero = Genero.NoFiccion),
        Libro(id = "L4", titulo = "El Señor de los Anillos", precio = 35.0, stock = 3, autor = "J.R.R. Tolkien", genero = Genero.Ficcion)
    )

    val revistas = listOf(
        Revista(id = "R1", titulo = "National Geographic", precio = 5.0, stock = 20, numeroEdicion = 154),
        Revista(id = "R2", titulo = "Forbes", precio = 8.0, stock = 15, numeroEdicion = 85),
        Revista(id = "R3", titulo = "TIME", precio = 6.0, stock = 12, numeroEdicion = 202)
    )
}
