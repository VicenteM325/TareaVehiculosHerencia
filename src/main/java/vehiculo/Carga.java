package vehiculo;

import interfaz.MovimientoVehiculo;
import interfaz.VehiculoCarga;
import principal.Datos;

public class Carga extends Vehiculos implements MovimientoVehiculo, VehiculoCarga {

    public Carga(String tipocombustible) {
        super(tipocombustible, 100, 4, 50, 30);
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
    public void transportarMaterial() {

        Datos.mostrarMensaje("\n\t* Transportando Material - Funcion Auto de Carga");

    }

    @Override
    public String toString() {
        return "Auto de Carga [" +
                "Combustible: " + Tipocombustible  +
                "| Galones: " + cantGalones +
                "| Cant. Pasajeros: " + cantPasajeros +
                "| Velocidad Max: " + velocidadMax +
                "| Aceleracion Base: " + aceleracionBase +""+
                ']';
    }
    
}
