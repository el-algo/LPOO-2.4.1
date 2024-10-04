public class Main {
    public static void main(String[] args) {
        // Crear un objeto CuerpoHumano
        CuerpoHumano cuerpo = new CuerpoHumano(30, "Masculino", 70, 6.5);

        // Usar los atributos del CuerpoHumano
        System.out.println("Edad: " + cuerpo.getEdad());
        System.out.println("Sexo: " + cuerpo.getSexo());
        System.out.println("Ritmo Cardíaco: " + cuerpo.getCorazon().getRitmoCardiaco() + " latidos/minuto");
        System.out.println("Capacidad Respiratoria: " + cuerpo.getPulmon().getCapacidadRespiratoria() + " litros/minuto");
    }
}
