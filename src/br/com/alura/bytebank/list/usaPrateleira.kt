package br.com.alura.bytebank.list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaLivrosComNulos)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeListaComMarcadores()
    porAnoPublicacao.imprimeListaComMarcadores()


}