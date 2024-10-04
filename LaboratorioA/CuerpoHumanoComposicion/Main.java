package CuerpoHumanoComposicion;

/**
 * Programa de pueba de CuerpoHumano
 */
public class Main {
    public static void main(String[] args) {
        CuerpoHumano cuerpo = new CuerpoHumano(
            75,
            300,
            "O+",
            6000,
            2500,
            true,
            1.5,
            4,
            true,
            15.0,
            false,
            true
        );
        cuerpo.setEdad(64);
        
        System.out.println("Edad:" + cuerpo.getEdad());
        System.out.println("Tipo de sangre:" + cuerpo.corazon.getTipoSangre());
        System.out.println("Cantidad de Oxigeno:" +
                cuerpo.pulmonDerecho.getCantidadOxigeno() + " ml");
        System.out.println("Peso del higado:" + cuerpo.higado.getPeso() + " gm");
        System.out.println("Apendice inflamado:" + cuerpo.apendice.isInflamado());
    }
}
