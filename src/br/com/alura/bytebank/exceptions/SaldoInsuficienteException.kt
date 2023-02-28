package br.com.alura.bytebank.exceptions

class SaldoInsuficienteException(
    mensage: String = "O saldo é insuficiente") : Exception(mensage)

