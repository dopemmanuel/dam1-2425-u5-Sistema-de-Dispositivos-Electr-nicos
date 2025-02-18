package com.dam1.eju5_1.src.interfaces

interface Vehiculo {
    var motorEncendio: Boolean
    var kilometraje: Int

    fun acelerar(velocidad: Int)
    fun frenar(velocidad: Int)
}