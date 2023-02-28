package br.com.alura.bytebank.array

fun idade (){
    val idades: IntArray = intArrayOf(2,4,5,6,39)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média das idades: $media")

    val todosMaiores = idades.all { it >= 18 }
    println(todosMaiores)

    val existeMaior = idades.any { it >= 18 }
    println(existeMaior)

    val maiores = idades.filter { it >=18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Em busca: $busca")
}