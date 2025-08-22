fun main(){

    /*al utllizar el range en el for se ´hace asi: for (i in 3..300) quesea: 3 hasta 300*/

    /*var a: String? = "Hello"
    a = null
    println("el largo es: " + a?.length)*/



    /*
    val sum = 5+3
    val res = 5-3
    val mul = 5*3
    val div = 5/3
    /*val div =(5.toFloat() /3)
    con esto puedo hacer que la divicion me la de sin acortar, que no sea un numero entero
      */
    val mod = 7%3
    /* es lo que me sobra ejemplo 7%3 me daria 1, y ese uno seria prk el sobra 1 para alcanzar 7*/

    print("estoy en suma\n")
    println("sum: $sum")

    print("estoy en resta\n")
    println("res: $res")

    print("estoy en multiplicacion\n")
    println("mul: $mul")

    print("estoy en division\n")
    println("div: $div")

    print("estoy en modulo\n")
    println("mod: $mod")
    /* para llamar la variabel y no colocar el "+" es con "$"*/

    */



    /*fun es funcion de funcionalidad*/

    var a = 5
    var b = 3
    sumar(a,b)
    sumar(9,6)
    sumar(4,7)
    sumar(93,1)

    var c = 5
    var d = 3
    resta(c,d)
    resta(9,6)
    resta(4,7)
    resta(93,1)

    var e = 5
    var f = 3
    multiplicacion(e,f)
    multiplicacion(9,6)
    multiplicacion(4,7)
    multiplicacion(93,1)

    var g = 5
    var h = 0
    division(g,h)
    division(9,6)
    division(4,7)
    division(93,1)
}
fun sumar(a:Int,b:Int){
    print("programa de sumas extremas - voy a sumar $a con $b = ")
    println(a+b)
}

fun resta(c:Int,d:Int){
    print("programa de restas extremas - voy a restar $c con $d = ")
    println(c-d)
}

fun multiplicacion(e:Int,f:Int){
    print("programa de multiplicacion extremas - voy a multiplicacion $e con $f = ")
    println(e*f)
}

fun division(g: Int, h: Int) {
    if (h == 0) {
        println("No se puede dividir por cero")
    } else {
        println("Programa de división extrema - voy a dividir $g con $h = ${g / h}")
    }
}
