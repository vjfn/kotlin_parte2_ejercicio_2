package com.example.kotlin_parte2_ejercicio_2

//fun main(){
//
//    val Persona1 = Persona("Pepe", "Lopez", 123456789 )
//
//    val Cuenta1 = Cuenta("N786",740.20, Persona1)
//
//    println(Persona1)
//    println(Cuenta1)
//
//
//}

fun main() {
    val persona1 = Persona("Juan", "Perez", "123456789")
    val persona2 = Persona("Maria", "Gomez", "987654321")

    val cuenta1 = Cuenta("12345", 1000.0, persona1)
    val cuenta2 = Cuenta("67890", 500.0, persona2)

    cuenta1.transaccion(200.0, "reintegro")
    cuenta1.transaccion(300.0, "ingreso")

    cuenta2.transaccion(100.50, "reintegro")
    cuenta2.transaccion(300.87, "ingreso")

    println("Datos de Persona 1: ${persona1.toString()}")
    println("Datos de Persona 2: ${persona2.toString()}")
    println("Datos de Cuenta 1: ${cuenta1.toString()}")
    println("Datos de Cuenta 2: ${cuenta2.toString()}")
}