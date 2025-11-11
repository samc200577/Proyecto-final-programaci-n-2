package co.edu.uniquindio.poo.proyecto_final_p2.model;


public class Repartidor extends Persona {

    private ZonaCobertura zona;
    private Disponibilidad disponibilidad;

    public Repartidor(int id, String nombre, String telefono, ZonaCobertura zona, Disponibilidad disponibilidad) {
        super(id, nombre, telefono);
        this.zona = zona;
        this.disponibilidad = disponibilidad;
    }

    //patrón factory

    public static Repartidor crearRepartidor(int id, String nombre, String telefono, ZonaCobertura zona) {
        return new Repartidor(id, nombre, telefono, zona, Disponibilidad.ACTIVO);
    }

    public ZonaCobertura getZona() {
        return zona;
    }

    public void setZona(ZonaCobertura zona) {
        this.zona = zona;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Repartidor: " + nombre + " | Zona: " + zona + " | Estado: " + disponibilidad;
    }
}

