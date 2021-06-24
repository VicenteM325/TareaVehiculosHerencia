package vehiculo;

import interfaz.MovimientoVehiculo;
import interfaz.VehiculoCarrera;
import principal.Datos;

public class Carrera extends Vehiculos implements MovimientoVehiculo, VehiculoCarrera {


    public Carrera(String tipocombustible) {
        super(tipocombustible, 100, 2, 300, 200);
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
    public void turbo() {
        Datos.mostrarMensaje("\n\t* Iniciando Turbo -> Funcion Auto de Carreras");
    }


    @Override
    public void triplicarAceleracion() {
        Datos.mostrarMensaje("\n\t* Triplicando Aceleracion -> Funcion Auto de Carreras");
    }

    @Override
    public String toString() {
        return "Auto de Carrera [" +
                "Combustible: " + Tipocombustible  +
                "| Galones: " + cantGalones +
                "| Cant. Pasajeros: " + cantPasajeros +
                "| Velocidad Max: " + velocidadMax +
                "| Aceleracion Base: " + aceleracionBase +""+
                ']';
    }

    
}