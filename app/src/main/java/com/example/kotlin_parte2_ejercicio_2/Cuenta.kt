package com.example.kotlin_parte2_ejercicio_2

class Cuenta (val numeroCuenta:String,val saldo:Double, val propietario:Persona){

    constructor():this("",0.0,Persona("","",""))


    override fun toString(): String {
        return "Cuenta(numeroCuenta='$numeroCuenta', Saldo='$saldo', Propietario=$propietario)"
    }
}