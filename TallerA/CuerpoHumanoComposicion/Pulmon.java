package CuerpoHumanoComposicion;

/**
 * Clase componente Pulmon
 */
public class Pulmon {
    private int capacidad; // en L
    private int cantidadOxigeno; // en ml
    private boolean sano;

    public Pulmon(int capacidad, int cantidadOxigeno, boolean sano) {
        this.capacidad = capacidad;
        this.cantidadOxigeno = cantidadOxigeno;
        this.sano = sano;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadOxigeno() {
        return cantidadOxigeno;
    }

    public void setCantidadOxigeno(int cantidadOxigeno) {
        this.cantidadOxigeno = cantidadOxigeno;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}
