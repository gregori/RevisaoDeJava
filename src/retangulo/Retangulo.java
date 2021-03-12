package retangulo;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            throw new IllegalArgumentException("O comprimento deve ser maior do que zero.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("A largura deve ser maior do que zero.");
        }
    }

    public double perimetro() {
        return 2 * comprimento + 2 * largura;
    }

    public double area() {
        return comprimento * largura;
    }
}
