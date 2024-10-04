package CuerpoHumanoComposicion;

/**
 * Clase TODO CuerpoHumano
 */
public class CuerpoHumano {
    private int edad;
    private String nombre;
    private boolean saludable;
    
    // Corazon, Pulmon, Higado y Apendice son atributos del CuerpoHumano
    public Corazon corazon;
    public Pulmon pulmonDerecho;
    public Pulmon pulmonIzquierdo;
    public Higado higado;
    public Apendice apendice;

    // Los componentes dependen de la existencia del CuerpoHumano
    public CuerpoHumano(int latidosPorMinuto, double tamaño, String tipoSangre,
            int capacidadPulmon, int cantidadOxigeno, boolean pulmonSano,
            double pesoHigado, int numeroDeLobulos, boolean higadoFuncionando,
            double longitudApendice, boolean apendiceInflamado,
            boolean apendiceVital) {
        this.corazon = new Corazon(latidosPorMinuto, tamaño, tipoSangre);
        this.pulmonDerecho = new Pulmon(capacidadPulmon, cantidadOxigeno,
                pulmonSano);
        this.pulmonIzquierdo = new Pulmon(capacidadPulmon, cantidadOxigeno,
                pulmonSano);
        this.higado = new Higado(pesoHigado, numeroDeLobulos, higadoFuncionando);
        this.apendice = new Apendice(longitudApendice, apendiceInflamado,
                apendiceVital);    
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }   
}
