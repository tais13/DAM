fun main() {
    //mutableListOf para que sea mutable si esta asi listOf no se puede modificar
    /*var lista = mutableListOf(1, 2, 5,8,10,33,67,100) // [1,2,5]
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("lista: $lista")

    var filtrado = lista.filter { it % 2 == 0 }
    println("filtrado: $filtrado")

    var doble = lista.map { it +1 }
    println("doble: $doble")

    var sumatoria = lista.sum()
    println("sumatoria: $sumatoria")

    var buscaElPar = lista.find { it % 2 != 0 }
    println("buscarElPar: $buscaElPar")

    var primerElemento = lista.first()
    println("primerElemento: $primerElemento")

    var ultimoElemento = lista.last()
    println("ultimoElemento: $ultimoElemento")*/

    //-----------------------------------------------------------------------------------------------------------------------------------

    /*var conjunto = setOf(1, 2, 5)
    println("conjunto: $conjunto")

    var mapa = mapOf("nombre" to "juan", "edad" to 9, "dolares" to 1000)
    println("mapa: $mapa")*/

    //-----------------------------------------------------------------------------------------------------------------------------------

    /*var lista = mutableListOf(1, 1,3,4,5)
    println("lista: $lista")

    for (j in lista){
        println("el elemento de la lista es: $j")
    }
    var informacion = mapOf("nombre" to "fernanda", "edad" to 29)
    informacion.forEach {
        (llave, valor) -> println("la llave es: $llave y el valor es: $valor")
    }*/

    //-----------------------------------------------------------------------------------------------------------------------------------

    //val no se puede cambiar, pero mar si se puede modificar
    class Pokemon(
        val nombre: String,
        var atk: Int,
        var hp: Int
    ){
        fun sePreparaParaLaBatalla(){
            println("el $nombre se prepara para la batalla")
        }
        fun informacion(){
            println("ATK: $atk HP: $hp")
        }
        fun recibirDano(dano: Int){
            println("$nombre recibe $dano puntos de daño")
            hp = hp - dano
            println("Ahora le quedan $hp puntos")
            if (hp<0){
                println("$nombre SE HA DEBILITADO !!!")
            }
        }
    }
    //esto es del main, pero como tengo mas ejercicios comentarios se confunde
    val charmander = Pokemon("charmander", 40, 80)
    val mewtwo = Pokemon("mewtwo",300,450)
    charmander.informacion()
    mewtwo.informacion()

    charmander.sePreparaParaLaBatalla()
    mewtwo.recibirDano(charmander.atk)

    mewtwo.sePreparaParaLaBatalla()
    charmander.recibirDano(mewtwo.atk)
}