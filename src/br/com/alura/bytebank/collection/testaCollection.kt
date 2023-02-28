package br.com.alura.bytebank.collection

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomeSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    println(nomeSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes{
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Pedro",
        "Luca",
        "Maria",
        "Joana"
    )
    for (nome in nomes) {
        println(nomes)
        println("Tem o nome Pedro? ${nomes.contains("Pedro")}")
        println("tamanho da coleção ${nomes.size}")
    }
}
