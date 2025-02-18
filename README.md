# Ejercicio 3: Sistema de Dispositivos Electrónicos

Crea tres interfaces:

- `EncendidoApagado` con métodos como `encender()` y `apagar()`.
- `DispositivoElectronico` con un método llamado `reiniciar()`.
- `Vehiculo` con dos propiedades: `motorEncendido` y `kmHora`; y los métodos `acelerar(Int)` y `frenar(Int)`.

Implementa estas interfaces en varias clases como `Telefono`, `Lavadora` y `Coche`.  
Cada clase debería tener su propia implementación de los métodos de las interfaces.

Reglas para `Coche`:
- Solo acelera y frena si el motor está encendido.
- Por defecto, un objeto coche estará apagado.
- Si a un coche le mandamos frenar y su valor final fuera negativo, le asignaremos a `kmHora` el valor `0`.

## Objetivos:
- Practicar la implementación de interfaces y entender cómo fuerzan a las clases a proporcionar implementaciones concretas.
- Comprender cómo se puede usar una interfaz para imponer un contrato que varias clases deben seguir.
- Familiarizarse con el concepto de separación de la interfaz y la implementación.