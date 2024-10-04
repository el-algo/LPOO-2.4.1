package CuerpoHumanoComposicion;

/**
 * Clase componente Higado
 */
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
