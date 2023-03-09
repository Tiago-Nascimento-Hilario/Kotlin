fun main() {
    criarComFuncao()
}

//Cria um array com uma a função arrayOf()
fun criarComFuncao() {
    val nomes = arrayOf("Aline", "Arthur", "Tiago", "alex", "lucas", "anderson")
//    val numeros = arrayOf<Int>(10, 20, 30)
    var contador  = 0

    for (index in nomes) {
        contador += 1
        println("$contador- $index")
    }
}