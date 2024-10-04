/**
 * Programa de pueba de Bicicleta
 */
public class Main {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta(
            "Montaña",
            "Trek",
            0,
            "Aluminio",
            "Negro",
            "Rectangular",
            "Aluminio",
            0,
            "Nuevo"
        );
        bici.setAño(2024);
        
        System.out.println("Año:" + bici.getAño());
        System.out.println("Color cuadro:" + bici.cuadro.getColor());
        System.out.println("Diametro ruedas:" + bici.ruedas[0].getDiametro());
    }
}
