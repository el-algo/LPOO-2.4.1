package CuerpoHumanoComposicion;

/**
 * Clase componente Corazon
 */
public class Corazon {
    private int latidosPorMinuto;
    private double tamaño; // en cm cubicos
    private String tipoSangre;

    public Corazon(int latidosPorMinuto, double tamaño, String tipoSangre) {
        this.latidosPorMinuto = latidosPorMinuto;
        this.tamaño = tamaño;
        this.tipoSangre = tipoSangre;
    }

    public int getLatidosPorMinuto() {
        return latidosPorMinuto;
    }

    public void setLatidosPorMinuto(int latidosPorMinuto) {
        this.latidosPorMinuto = latidosPorMinuto;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
}
