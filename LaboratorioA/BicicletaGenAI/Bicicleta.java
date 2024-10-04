class Bicicleta {
    private Cuadro cuadro; // Composición
    private Rueda rueda;   // Composición
    private int tamañoCuadro; // Atributo adicional

    public Bicicleta(int tamañoCuadro, int tamañoRueda, String color) {
        this.tamañoCuadro = tamañoCuadro;
        this.cuadro = new Cuadro(color); // Se crea el cuadro
        this.rueda = new Rueda(tamañoRueda); // Se crea la rueda
    }

    public int getTamañoCuadro() {
        return tamañoCuadro;
    }

    public void setTamañoCuadro(int tamañoCuadro) {
        this.tamañoCuadro = tamañoCuadro;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public Rueda getRueda() {
        return rueda;
    }
}
