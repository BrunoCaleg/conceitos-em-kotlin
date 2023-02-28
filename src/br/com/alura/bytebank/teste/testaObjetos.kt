package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaContasDiferentes

fun testaObjetos() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "323-232-323-22"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("nome do cliente ${fran.nome}")
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1234)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1235)

    println("Total de contas: ${Conta.total}")
}

