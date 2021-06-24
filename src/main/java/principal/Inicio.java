package principal;

import vehiculo.Camioneta;
import vehiculo.Carga;
import vehiculo.Carrera;
import vehiculo.Vehiculos;


public class Inicio {

    public Inicio(String nombre) {
        System.out.println(nombre + "\n");
        initEjercicio();
    }

    private void initEjercicio() {

        Vehiculos[] vehiculos = new Vehiculos[20];
        vehiculos[0] = new Carga("Diesel");
        vehiculos[1] = new Carrera("Gasolina");
        vehiculos[2] = new Camioneta("Diesel");

        vehiculos[3] = new Carga("Diesel");
        vehiculos[4] = new Carrera("Gasolina");
        vehiculos[5] = new Camioneta("Gasolina");

        vehiculos[6] = new Carga("Diesel");
        vehiculos[7] = new Carrera("Gasolina");
        vehiculos[8] = new Camioneta("Diesel");

        vehiculos[9] = new Carga("Diesel");
        vehiculos[10] = new Carrera("Gasolina");
        vehiculos[11] = new Camioneta("Diesel");

        vehiculos[12] = new Carga("Diesel");
        vehiculos[13] = new Carrera("Gasolina");
        vehiculos[14] = new Camioneta("Gasolina");

        vehiculos[15] = new Carga("Diesel");
        vehiculos[16] = new Carrera("Gasolina");
        vehiculos[17] = new Camioneta("Diesel");

        vehiculos[18] = new Carga("Diesel");
        vehiculos[19] = new Carrera("Gasolina");

        mostrarTiposVehiculos(vehiculos);

    }

    public void mostrarTiposVehiculos(Vehiculos[] vehiculos){
        for (Vehiculos vehi2: vehiculos) {
            vehi2.tipoVehiculo(vehi2);
            Datos.mostrarMensaje("\t\t"+vehi2+"\n\n\n");
        }
    }

}