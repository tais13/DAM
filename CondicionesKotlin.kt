fun main() {


    /*
    //ejemplos del uso del if//

    fun validacionEdad(edad: Int ){

        println("La edad es de $edad")
        if ( edad >= 18 ){
            println("es mayor de edad")
        }
        else{
            println("es menor de edad")
        }
    }
    validacionEdad(21)
    validacionEdad(14)
    validacionEdad(11)
    validacionEdad(60)
    */



    /*fun dividir(a: Int, b: Int ){

        println("voy a dividir $a entre $b")
        if ( b!= 0 ){
            println(a / b)
        }
        else{
            println("no se puede dividir entre 0")
        }
    }
    dividir(3,0)
    dividir(9,6)
    dividir(4,7)
    dividir(93,1)*/




    /*
    //uso del for dos en dos//

    fun Ciclo() {
        for (i in 1 .. 100)
        if (i % 2 == 0){
            println(i)
        }
    }
    Ciclo()*/



    /*fun Ciclo() {
        for (i in 1..20) {
            if (i == 5 || i in 11..19) {
            } else {
                print("$i ")
            }
        }
    }
    Ciclo()
    //ocupó el step 2 para que valla de 2 en 2//
    */





    /*
    //esta es lo mismo pero "avisando" con el texto//

    fun Ciclo(){
        for (i in 1 .. 100){
            println("camos enn el valor $i")
        }
    } */



    var  i=1;
    var ciclos = 1;
    do {

        ciclos++;
        val randomNumber = (0..10).random()
        i = i + randomNumber;
        println("ciclo $ciclos : $i")

    }while( i <= 300)

}

