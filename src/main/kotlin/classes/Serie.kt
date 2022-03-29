package classes

import Interfaces.Entregable

class Serie : Entregable {

    var titulo: String =" "
    var numTemp: Int = 3
    var entregado: Boolean = false
    var genero:String = " "
    var creador:String =" "

    constructor(){}

    constructor(titulo_s: String, creador_s: String){
        this.titulo = titulo_s
        this.creador = creador_s
    }

    constructor(titulo_s: String,numTemp: Int, genero_s: String,creador_s: String,){
        this.titulo = titulo_s
        this.numTemp = numTemp
        this.genero = genero_s
        this.creador = creador_s
    }

    override fun entregar(): Boolean {
        this.entregado = true
        return this.entregado

    }

    override fun devolver(): Boolean {
        this.entregado = false
        return this.entregado
    }

    override fun isEntregado(): Boolean {
        return this.entregado
    }


}