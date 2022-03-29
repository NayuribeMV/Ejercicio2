import classes.Serie
import classes.Videojuego

fun main(args: Array<String>) {
    var arrayS = arrayOf<Serie>()
    var arrayV = arrayOf<Videojuego>()

    val serie1 = Serie("Chapelwaite",1,"Terror","SK")
    val serie2 = Serie("Peaky Blinders",6,"Drama","Steven Knight")
    val serie3 = Serie("Arcane",1,"Ciencia ficcion","Christian Linke")
    val serie4 = Serie("Vinland Saga","KYN")
    val serie5 = Serie("Jujutsu kaisen","JJK")

    val videojuego1 = Videojuego("Death Stranding",15,"Misterio","Kojima Productions")
    val videojuego2 = Videojuego("Metal gear",8,"Accion","konami")
    val videojuego3 = Videojuego("God of War",10,"Accion y aventura","Santa Monica Studio")
    val videojuego4 = Videojuego("Valorant",8)
    val videojuego5 = Videojuego("Halo",10)

    arrayS = arrayS.plus(serie1)
    arrayS = arrayS.plus(serie2)
    arrayS = arrayS.plus(serie3)
    arrayS = arrayS.plus(serie4)
    arrayS = arrayS.plus(serie5)

    arrayV = arrayV.plus(videojuego1)
    arrayV = arrayV.plus(videojuego2)
    arrayV = arrayV.plus(videojuego3)
    arrayV = arrayV.plus(videojuego4)
    arrayV = arrayV.plus(videojuego5)



    //entregar
    serie1.entregar()
    serie2.entregar()
    videojuego1.entregar()
    videojuego2.entregar()
    videojuego3.entregar()


    var contSeriesE: Int = 0
    var contVideojE: Int = 0

    //array Series
    for(i in arrayS.indices){
       if(arrayS[i].isEntregado()){
           contSeriesE++
           arrayS[i].devolver()
       }
    }
    println("Series prestadas: " + contSeriesE)

    //array Videojuegos
    for(j in arrayV.indices){
        if(arrayV[j].isEntregado()){
            contVideojE++
            arrayV[j].devolver()
        }
    }
    println("Videojuegos prestados: " + contVideojE)

}