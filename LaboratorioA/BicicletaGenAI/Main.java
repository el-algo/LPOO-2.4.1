public class Main {
    public static void main(String[] args) {
        // Crear un objeto Bicicleta
        Bicicleta bicicleta = new Bicicleta(18, 26, "Rojo");

        // Usar los atributos de la bicicleta
        System.out.println("Tamaño del cuadro: " + bicicleta.getTamañoCuadro());
        System.out.println("Tamaño de la rueda: " + bicicleta.getRueda().getTamaño());
        System.out.println("Color del cuadro: " + bicicleta.getCuadro().getColor());
    }
}
