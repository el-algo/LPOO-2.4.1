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

    // Clase anidada Corazon
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

    // Clase anidada Pulmon
    public class Pulmon {
        private int capacidad; // en L
        private int cantidadOxigeno; // en ml
        private boolean sano;
    
        public Pulmon(int capacidad, int cantidadOxigeno, boolean sano) {
            this.capacidad = capacidad;
            this.cantidadOxigeno = cantidadOxigeno;
            this.sano = sano;
        }
    
        public int getCapacidad() {
            return capacidad;
        }
    
        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }
    
        public int getCantidadOxigeno() {
            return cantidadOxigeno;
        }
    
        public void setCantidadOxigeno(int cantidadOxigeno) {
            this.cantidadOxigeno = cantidadOxigeno;
        }
    
        public boolean isSano() {
            return sano;
        }
    
        public void setSano(boolean sano) {
            this.sano = sano;
        }
    }

    // Clase anidada Higado
    public class Higado {
        private double peso; // en gm
        private int numeroDeLobulos;
        private boolean funcionando;
    
        public Higado(double peso, int numeroDeLobulos, boolean funcionando) {
            this.peso = peso;
            this.numeroDeLobulos = numeroDeLobulos;
            this.funcionando = funcionando;
        }
    
        public double getPeso() {
            return peso;
        }
    
        public void setPeso(double peso) {
            this.peso = peso;
        }
    
        public int getNumeroDeLobulos() {
            return numeroDeLobulos;
        }
    
        public void setNumeroDeLobulos(int numeroDeLobulos) {
            this.numeroDeLobulos = numeroDeLobulos;
        }
    
        public boolean isFuncionando() {
            return funcionando;
        }
    
        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }
    }
    
    // Clase anidada Apendice
    public class Apendice {
        private double longitud; // en cm
        private boolean inflamado;
        private boolean vital;
    
        public Apendice(double longitud, boolean inflamado, boolean vital) {
            this.longitud = longitud;
            this.inflamado = inflamado;
            this.vital = vital;
        }
    
        public double getLongitud() {
            return longitud;
        }
    
        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }
    
        public boolean isInflamado() {
            return inflamado;
        }
    
        public void setInflamado(boolean inflamado) {
            this.inflamado = inflamado;
        }
    
        public boolean isVital() {
            return vital;
        }
    
        public void setVital(boolean vital) {
            this.vital = vital;
        }
    }
}