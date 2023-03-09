fun main (){
    val nootebock = arrayOf("positivo", "asus", "hp", "dell")

    var cont  =  0

    for ((index, valor) in nootebock.withIndex()){
        cont += 1
        println("$cont- $valor")
    }
    for (index in 1..10 step 2 ){
        println(index)
    }
}

