package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua Pedro",
        complemento = "Agua",
        cep = 123
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua Pedro",
        complemento = "Agua",
        cep = 123
    )
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(enderecoNovo.toString())
}