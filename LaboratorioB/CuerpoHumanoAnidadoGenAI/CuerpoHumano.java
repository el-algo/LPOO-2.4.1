class CuerpoHumano {
    private int edad; // Edad del cuerpo humano
    private String sexo; // Sexo del cuerpo humano
    private Corazon corazon; // Composición (clase anidada)
    private Pulmon pulmon; // Composición (clase anidada)

    // Constructor de CuerpoHumano
    public CuerpoHumano(int edad, String sexo, int ritmoCardiaco, double capacidadRespiratoria) {
        this.edad = edad;
        this.sexo = sexo;
        this.corazon = new Corazon(ritmoCardiaco); // Crear un nuevo corazón
        this.pulmon = new Pulmon(capacidadRespiratoria); // Crear un nuevo pulmón
    }

    // Getters y Setters
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

    // Clase anidada Corazon
    class Corazon {
        private int ritmoCardiaco; // Ritmo cardíaco en latidos por minuto

        public Corazon(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }
    }

    // Clase anidada Pulmon
    class Pulmon {
        private double capacidadRespiratoria; // Capacidad respiratoria en litros por minuto

        public Pulmon(double capacidadRespiratoria) {
            this.capacidadRespiratoria = capacidadRespiratoria;
        }

        public double getCapacidadRespiratoria() {
            return capacidadRespiratoria;
        }

        public void setCapacidadRespiratoria(double capacidadRespiratoria) {
            this.capacidadRespiratoria = capacidadRespiratoria;
        }
    }
}
