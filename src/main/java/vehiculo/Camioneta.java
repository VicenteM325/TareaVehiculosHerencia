package vehiculo;

import interfaz.MovimientoVehiculo;
import interfaz.VehiculoCamioneta;
import principal.Datos;

public class Camioneta extends Vehiculos implements MovimientoVehiculo, VehiculoCamioneta {


    
    public Camioneta(String tipocombustible) {
        super(tipocombustible, 100, 30, 90, 50);
    }


    @Override
    public void movDerecha() {
        Datos.mostrarMensaje("\n\t* Moviendome hacia la Derecha");

    }

    
    @Override
    public void movIzquierda() {
        Datos.mostrarMensaje("\n\t* Moviendome hacia la Izquierda");

    }

    
    @Override
    public void transportarPersona() {
        Datos.mostrarMensaje("\n\t* Transportando Personas - Funcion de Autobus");

    }

    @Override
    public String toString() {
        return "Autobus [" +
                "Combustible: " + Tipocombustible  +
                "| Galones: " + cantGalones +
                "| Cant. Pasajeros: " + cantPasajeros +
                "| Velocidad Max: " + velocidadMax +
                "| Aceleracion Base: " + aceleracionBase +""+
                ']';
    }
    
}
