package calculapi;

public class CalcupaPI {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        double numerador = 1.0;
        double soma = 0;

        for (int i = 1; i < max; i += 2) {
            soma += numerador / i;
            numerador *= -1.0;
        }

        double piCalculado = 4 * soma;
        double erro = 1 - (piCalculado / Math.PI);

        System.out.println("O valor de pi é: " + piCalculado);
        System.out.println("Erro: " + erro);
    }
}
