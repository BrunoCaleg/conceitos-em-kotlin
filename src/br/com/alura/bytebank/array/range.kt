package br.com.alura.bytebank.array

fun range() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        println("$s")
    }
    println()

    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        println(numeroPar)
    }
    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach{ print("$it") }

    val intervalo = 1500.00..6000.0
    val salario = 4000.0
    if(salario in intervalo) {
        println("Esta dentro do intervalo")
    } else {
        println("Esta dentro do intervalo")

    }
    val alfabeto = "a".."z"
    val letra = "f"
    println(letra in alfabeto)

}
