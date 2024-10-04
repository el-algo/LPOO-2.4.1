package Bicicleta;

/**
 * Clase TODO Bicicleta
 */
public class Bicicleta {
    private String tipo;
    private String marca;
    private int año;
    
    // Cuadro y Rueda son atributos de Bicicleta
    public Cuadro cuadro;
    public Rueda ruedas[];
    
    public Bicicleta(String tipo, String marca, int año, String materialCuadro,
            String colorCuadro, String formaCuadro, String materialRueda, 
            double diametroRueda, String condicionRueda) {
        this.tipo = tipo;
        this.marca = marca;
        this.año = año;
        
        // Los componentes dependen de la existencia de Bicicleta
        cuadro = new Cuadro(materialCuadro, colorCuadro, formaCuadro);
        
        ruedas = new Rueda[2];
        ruedas[0] = new Rueda(materialRueda, diametroRueda, condicionRueda);
        ruedas[1] = new Rueda(materialRueda, diametroRueda, condicionRueda);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
