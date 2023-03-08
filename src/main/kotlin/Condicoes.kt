/*Kotlin não ha operador ternário if é uma expressão retorna um valor*/
fun main() {
    verifica("Tiago Nascimento Hilario")
}

const val numero: Int = 0

fun verifica(nome: String) {
    if (nome == "Tiago Nascimento Hilario"){
        println(nome)
    } else println("Você não é o Tiago")
}

