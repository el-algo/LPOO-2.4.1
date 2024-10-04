class CuerpoHumano {
    private int edad;
    private String sexo;
    private Corazon corazon; // Composición
    private Pulmon pulmon; // Composición

    public CuerpoHumano(int edad, String sexo, int ritmoCardiaco, double capacidadRespiratoria) {
        this.edad = edad;
        this.sexo = sexo;
        this.corazon = new Corazon(ritmoCardiaco); // Se crea el corazón
        this.pulmon = new Pulmon(capacidadRespiratoria); // Se crea el pulmón
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }
}
