package com.dam1.eju5_1.src.clases

import com.dam1.eju5_1.src.interfaces.EncendidoApagado
import com.dam1.eju5_1.src.interfaces.DispositivoElectronico

class Lavadora: EncendidoApagado, DispositivoElectronico {
    override fun encender(): String {
        return "Lavadora encendida!!"
    }
    override fun apagar(): String {
        return "Apagando lavadora..."
    }
    override fun reiniciar(): String {
        return "Reiniciando Giro de la lavadora..."
    }
}