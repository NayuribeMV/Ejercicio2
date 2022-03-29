package classes

import Interfaces.Entregable

class Videojuego : Entregable{

    var titulo: String = " "
    var horasE: Int = 10
    var entregado: Boolean = false
    var genero: String = " "
    var compannia:String = " "

    constructor(){}

    constructor(titulo_v: String, horasE_v:Int){
        this.titulo = titulo_v
        this.horasE = horasE_v
    }

    constructor(titulo_v: String, horasE_v:Int, genero_v:String, compannia_v:String){
        this.titulo = titulo_v
        this.horasE = horasE_v
        this.genero = genero_v
        this.compannia = compannia_v

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