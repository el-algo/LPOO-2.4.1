package CuerpoHumanoComposicion;

/**
 * Clase componente Apendice
 */
public class Apendice {
    private double longitud; // en cm
    private boolean inflamado;
    private boolean vital;

    public Apendice(double longitud, boolean inflamado, boolean vital) {
        this.longitud = longitud;
        this.inflamado = inflamado;
        this.vital = vital;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isInflamado() {
        return inflamado;
    }

    public void setInflamado(boolean inflamado) {
        this.inflamado = inflamado;
    }

    public boolean isVital() {
        return vital;
    }

    public void setVital(boolean vital) {
        this.vital = vital;
    }
}
