package br.com.alura.bytebank.array

import java.math.BigDecimal
import java.math.RoundingMode

fun bigDecimo() {
    val salarios = bigDecimalArrayof("1500.44", "222.47", "4000.22", "6000.23", "1234.23")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    //utilizamos a função fold() para calcular a soma dos
    // salários com aumento pelos próximos 6 meses, utilizando
    // o retorno da função somatória como gasto inicial:
    val gastoInicial = salariosComAumento.somatorial()
    println(gastoInicial)
    val meses = 6.toBigDecimal()
    val gastoFinal = salariosComAumento.fold(gastoInicial){ acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoFinal)

    //calculamos a média dos 3 maiores e dos 3 menores salários
    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media)

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println(mediaMenoresSalarios)

}

fun bigDecimalArrayof(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

//Nesta aula, para calcular a soma do array de salários,
// criamos uma extension function para os arrays do tipo BigDecimal,
// utilizando a função reduce
fun Array<BigDecimal>.somatorial(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

// extension function para os arrays do tipo BigDecimal
// para calcular a média simples entre os valores do array
fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatorial() / this.size.toBigDecimal()
    }
}
