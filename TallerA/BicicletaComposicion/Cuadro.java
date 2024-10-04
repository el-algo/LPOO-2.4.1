package Bicicleta;

/**
 * Clase componente Cuadro
 */
public class Cuadro {
    private String material;
    private String color;
    private String forma;

    public Cuadro(String material, String color, String forma) {
        this.material = material;
        this.color = color;
        this.forma = forma;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
