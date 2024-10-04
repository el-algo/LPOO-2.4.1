package TallerB.BicicletaAnidada;

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

    // Clase anidada Cuadro
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

    // Clase anidada Rueda
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
}
