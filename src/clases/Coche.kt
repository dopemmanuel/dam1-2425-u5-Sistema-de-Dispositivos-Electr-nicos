package com.dam1.eju5_1.src.clases

import com.dam1.eju5_1.src.interfaces.EncendidoApagado
import com.dam1.eju5_1.src.interfaces.Vehiculo


class Coche: EncendidoApagado, Vehiculo {
    override var motorEncendio: Boolean = false
    override var kilometraje: Int = 0

    override fun encender(): String {
        motorEncendio = true
        return "VRoooooom!"
    }

    override fun apagar(): String {
        motorEncendio = false
        kilometraje = 0
        return "pfrom!"
    }

    override fun acelerar(velocidad: Int) {
        if (motorEncendio) {
            kilometraje = kilometraje + velocidad
            println("Acelerando a $kilometraje KM/h")
        } else {
            println("No se puede acelerar si el motor esta encendido ")
        }
    }
    override fun frenar(velocidad: Int) {
        kilometraje = kilometraje - velocidad
        if (kilometraje < 0) {
            kilometraje = 0
            println("Frenando... Velocidad actual $kilometraje")
        }
    }
}