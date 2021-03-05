package populacaomundial;

public class PopulacaoMundial {
    public static void main(String[] args) {
        double populacaoMundial = 7849975775.0;

        int anos = Integer.parseInt(args[0]);

        // fórmula dos juros compostos
        double popFutura = populacaoMundial * Math.pow(1 + 0.0105, anos);

        // Solução com FOR
        for (int i = 0; i < anos; i++) {
            populacaoMundial += populacaoMundial * 0.0105;
        }

        System.out.printf("%,.0f pessoas.\n", populacaoMundial);
    }
}
