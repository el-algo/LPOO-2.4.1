class Bicicleta {
    private int tamañoCuadro; // Tamaño del cuadro
    private String color; // Color de la bicicleta
    private Rueda rueda; // Composición (clase anidada)

    // Constructor de Bicicleta
    public Bicicleta(int tamañoCuadro, int tamañoRueda, String color) {
        this.tamañoCuadro = tamañoCuadro;
        this.color = color;
        this.rueda = new Rueda(tamañoRueda); // Crear una nueva rueda
    }

    // Getters y Setters
    public int getTamañoCuadro() {
        return tamañoCuadro;
    }

    public void setTamañoCuadro(int tamañoCuadro) {
        this.tamañoCuadro = tamañoCuadro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rueda getRueda() {
        return rueda;
    }

    // Clase anidada Rueda
    class Rueda {
        private int tamaño; // Tamaño de la rueda

        public Rueda(int tamaño) {
            this.tamaño = tamaño;
        }

        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }
    }

    // Clase anidada Cuadro
    class Cuadro {
        private String material; // Material del cuadro

        public Cuadro(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }
}
