package Bicicleta;

/**
 * Clase componente Rueda
 */
public class Rueda {
    private String material;
    private double diametro;
    private String condicionUso;

    public Rueda(String material, double diametro, String condicionUso) {
        this.material = material;
        this.diametro = diametro;
        this.condicionUso = condicionUso;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getCondicionUso() {
        return condicionUso;
    }

    public void setCondicionUso(String condicionUso) {
        this.condicionUso = condicionUso;
    }
}
