package Ejercicio_0;

/**
 * Clase que representa una mercancia peligrosa
 */
public class Mercancia {
    String nombre;
    String origen;
    String destino;
    int cantidad;

    /**
     * Constructor de mercancia
     *
     * @param nombre Nombre de la mercancia
     * @param origen Lugar de origen
     * @param destino Lugar de destino
     * @param cantidad Cantidad de mercancia transportada
     */
    public Mercancia(String nombre, String origen, String destino, int cantidad) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Sobreescribe el metodo toString para representar la mercancia
     *
     * @return String con la informacion de la mercancia
     *
     */
    @Override
    public String toString() {
        return String.format("Mercancía: " + nombre + " | Origen: " + origen + " | Destino: " + destino + " | Cantidad: " + cantidad);
    }
}
