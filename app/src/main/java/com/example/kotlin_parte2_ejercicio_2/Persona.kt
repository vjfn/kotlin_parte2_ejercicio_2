package com.example.kotlin_parte2_ejercicio_2

class Persona(val nombre:String, val apellido:String, val telefono:String) {


    init {
        if(telefono.length!=9){
            println("Número no Válido")
        }
    }


    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', telefono=$telefono)"
    }
}