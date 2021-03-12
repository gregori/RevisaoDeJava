package retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {
        double comprimento = Double.parseDouble(args[0]);
        double largura = Double.parseDouble(args[1]);

        try {
            Retangulo r = new Retangulo(comprimento, largura);
            System.out.println("Área: " + r.area());
            System.out.println("Perímetro: " + r.perimetro());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: um dos lados do retângulo é igual ou menor que zero.");
        }
    }
}
