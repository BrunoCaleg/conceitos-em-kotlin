package br.com.alura.bytebank.array

fun testeArray() {
    val idades: IntArray = intArrayOf(25, 19, 23, 12, 12)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Idade: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade)
            menorIdade = idade
    }

    println("Idade: $menorIdade")
}
