package br.com.alura.bytebank.list

fun main(){
val livro1 = Livro(
    titulo = "Grande Sertão: Veredas",
    autor = "João Guimarães Rosa",
    anoPublicacao = 1956
)

val livro2 = Livro(
    titulo = "Minha vida de menina",
    autor = "Helena Morley",
    anoPublicacao = 1942,
    editora = "Editora A"
)

val livro3 = Livro(
    titulo = "Memórias Póstumas de Brás Cubas",
    autor = "Machado de Assis",
    anoPublicacao = 1881
)

val livro4 = Livro(
    titulo = "Iracema",
    autor = "José de Alencar",
    anoPublicacao = 1865,
    editora = "Editora B"
)

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães",
            anoPublicacao = 1946
        )
    )

    livros.imprimeListaComMarcadores()

    livros.remove(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães",
            anoPublicacao = 1946
        )
    )

    livros.imprimeListaComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeListaComMarcadores()

    val ordenadorPorTitulo = livros.sortedBy { it.titulo }
    ordenadorPorTitulo.imprimeListaComMarcadores()

    livros.sortedBy { it.autor }.imprimeListaComMarcadores()



}

fun  List<Livro?>.imprimeListaComMarcadores() {
    val listaComMarcadores = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("\n ### Lista de Livros ### \n${listaComMarcadores}")
}