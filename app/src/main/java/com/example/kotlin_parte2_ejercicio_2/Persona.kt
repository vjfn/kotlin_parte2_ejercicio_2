package com.example.kotlin_parte2_ejercicio_2

//class Persona(val nombre:String, val apellido:String, val telefono:String) {
//
//
//    init {
//        if(telefono.length!=9){
//            println("Número no Válido")
//        }
//    }
//
//
//    override fun toString(): String {
//        return "Persona(nombre='$nombre', apellido='$apellido', telefono=$telefono)"
//    }
//}

class Persona(val nombre: String, val apellido: String, var telefono: String) {
    init {
        require(telefono.length == 9) { "El teléfono debe tener 9 dígitos" }
    }

    override fun toString(): String {
        return "Nombre: $nombre, Apellido: $apellido, Teléfono: $telefono"
    }
}