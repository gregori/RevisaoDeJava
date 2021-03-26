package cartas;

public class CartasTeste {
    public static void main(String[] args) {
        Baralho b = new Baralho();
        System.out.println("Embaralhando o monte!");
        b.embaralhar();

        boolean baralhoNaoVazio = true;

        while (baralhoNaoVazio) {
            try {
                System.out.println("Distribuindo " + b.distribuir());
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Nenhuma carta no baralho! Fim de jogo!");
                baralhoNaoVazio = false;
            }
        }
    }
}
