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
            "Nueva"
        );
        bici.setAño(2024);
        
        System.out.println("Año:" + bici.getAño());
        System.out.println("Color cuadro:" + bici.cuadro.getColor());
        System.out.println("Diametro ruedas:" + bici.ruedas[0].getDiametro());

        // Modalidad A
        System.out.println();
        Bicicleta.Cuadro cuadro = bici.new Cuadro(
            "Lamina", "Verde", "Triangular");
        System.out.println("Material de cuadro:" + cuadro.getMaterial());
        System.out.println("Color de cuadro:" + cuadro.getColor());
        System.out.println("Forma de cuadro:" + cuadro.getForma());
        
        Bicicleta.Rueda llanta = bici.new Rueda(
            "Caucho", 15.2, "Nueva");
        System.out.println("Material de llanta:" + llanta.getMaterial());
        System.out.println("Diametro de llanta:" + llanta.getDiametro());
        System.out.println("Condición de llanta:" + llanta.getCondicionUso());
    
        // Modalidad B
        System.out.println();
        bici.cuadro.setMaterial("Fierro");
        bici.cuadro.setColor("Blanco");
        bici.cuadro.setForma("Triangular");

        System.out.println("Material de cuadro de bici:" +
            bici.cuadro.getMaterial());
        System.out.println("Color de cuadro:" + bici.cuadro.getColor());
        System.out.println("Forma de cuadro:" + bici.cuadro.getForma());

        bici.ruedas[0].setMaterial("Sintetico");
        bici.ruedas[0].setDiametro(14.8);
        bici.ruedas[0].setCondicionUso("Gastada");

        System.out.println("Material de llanta:" +
            bici.ruedas[0].getMaterial());
        System.out.println("Diametro de llanta:" +
            bici.ruedas[0].getDiametro());
        System.out.println("Condición de llanta:" +
            bici.ruedas[0].getCondicionUso());
    }
}
