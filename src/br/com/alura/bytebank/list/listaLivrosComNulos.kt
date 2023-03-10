package br.com.alura.bytebank.list

fun main(){
    listaLivrosComNulos
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach { editora: String, livros: List<Livro> ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}

val listaLivrosComNulos: MutableList<Livro> = mutableListOf(

    Livro(
    titulo = "Grande Sertão: Veredas",
    autor = "João Guimarães Rosa",
    anoPublicacao = 1956
),

     Livro(
    titulo = "Minha vida de menina",
    autor = "Helena Morley",
    anoPublicacao = 1942,
    editora = "Editora A"
),

 Livro(
    titulo = "Memórias Póstumas de Brás Cubas",
    autor = "Machado de Assis",
    anoPublicacao = 1881
),
 Livro(
    titulo = "Iracema",
    autor = "José de Alencar",
    anoPublicacao = 1865,
    editora = "Editora B"
    )
)


