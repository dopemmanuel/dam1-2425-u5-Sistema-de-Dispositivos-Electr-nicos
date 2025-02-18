package com.dam1.eju5_1.src.clases

import com.dam1.eju5_1.src.interfaces.EncendidoApagado
import com.dam1.eju5_1.src.interfaces.DispositivoElectronico

class Telefono: EncendidoApagado, DispositivoElectronico {
    override fun encender(): String {
        return "encendiendo..."
    }
    override fun apagar(): String {
        return "Apagando..."
    }
    override fun reiniciar(): String {
        return "Reiniciando..."
    }
}