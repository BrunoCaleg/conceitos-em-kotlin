package br.com.alura.bytebank.array

fun salario() {
    val salarios: DoubleArray = doubleArrayOf(1100.0, 600.0, 1300.0, 1600.0, 2100.0)
    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}