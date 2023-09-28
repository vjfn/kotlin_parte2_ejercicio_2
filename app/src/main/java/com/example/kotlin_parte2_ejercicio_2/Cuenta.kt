package com.example.kotlin_parte2_ejercicio_2

//class Cuenta (val numeroCuenta:String,val saldo:Double, val propietario:Persona){
//
//    constructor():this("",0.0,Persona("","",""))
//
//
//    override fun toString(): String {
//        return "Cuenta(numeroCuenta='$numeroCuenta', Saldo='$saldo', Propietario=$propietario)"
//    }
//}

class Cuenta(val numeroCuenta: String, var saldo: Double, var propietario: Persona) {

    constructor():this("",0.0,Persona("","",""))
    init {
        require(saldo >= 0) { "El saldo no puede ser menor que 0" }
    }

    fun transaccion(cantidad: Double, tipoTransaccion: String) {
        when (tipoTransaccion) {
            "reintegro" -> {
                require(cantidad >= 0) { "La cantidad a reintegrar no puede ser negativa" }
                saldo -= cantidad
                println("Reintegro: $cantidad")
            }
            "ingreso" -> {
                require(cantidad >= 0) { "La cantidad a ingresar no puede ser negativa" }
                saldo += cantidad
                println("Ingreso: $cantidad")
            }
            else -> println("Tipo de transacción no válido")
        }
        println("Nuevo saldo: $saldo")
    }

    override fun toString(): String {
        return "Número de Cuenta: $numeroCuenta, Saldo: $saldo, Propietario: ${propietario.nombre} ${propietario.apellido}"
    }
}
