package vehiculo;
import principal.Datos;

abstract public class Vehiculos {

    protected String Tipocombustible;
    protected int cantGalones;
    protected int cantPasajeros;
    protected int velocidadMax;
    protected double aceleracionBase;

    //--- Constructor Vehículos
    public Vehiculos(String tipocombustible, int cantGalones, int cantPasajeros,
                     int velocidadMax, double aceleracionBase) {
        Tipocombustible = tipocombustible;
        this.cantGalones = cantGalones;
        this.cantPasajeros = cantPasajeros;
        this.velocidadMax = velocidadMax;
        this.aceleracionBase = aceleracionBase;
    }

    //--- Getters y Setters
    public String getTipocombustible() {
        return Tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        Tipocombustible = tipocombustible;
    }

    public int getCantGalones() {
        return cantGalones;
    }

    public void setCantGalones(int cantGalones) {
        this.cantGalones = cantGalones;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

    public void tipoVehiculo(Vehiculos tiposVehiculos){

        if (tiposVehiculos instanceof Carga){
            Datos.mostrarMensaje("---------------------AUTOMOVIL DE CARGA----------------------\n");
        }

        if (tiposVehiculos instanceof Carrera){
            Datos.mostrarMensaje("----------------------AUTOMOVIL DE CARRERA-------------------\n");
        }

        if(tiposVehiculos instanceof Camioneta){
            Datos.mostrarMensaje("----------------------------CAMIONETA------------------------------ \n");
        }
    }

    @Override
    public String toString() {
        return "Vehiculos [" +
                "Combustible: " + Tipocombustible  +
                "| Galones: " + cantGalones +
                "| Cant. Pasajeros: " + cantPasajeros +
                "| Velocidad Max: " + velocidadMax +
                "| Aceleracion Base: " + aceleracionBase +"]"+
                ']';

    }
}