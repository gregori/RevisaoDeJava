package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> monte;
    private int cartaAtual;
    public static final int TOTAL_DE_CARTAS = 52;

    private static final String[] NAIPES = {
            "Paus", "Ouros", "Copas", "Espadas"
    };

    public static final String[] VALORES = {
            "Ás", "Dois", "Três", "Quatro",
            "Cinco", "Seis", "Sete", "Oito",
            "Nove", "Dez", "Valete",
            "Dama", "Rei"
    };

    // construtor - estado inicial da classe
    public Baralho() {
        // instancia o monte com tamanho inicial de TOTAL_DE_CARTAS
        monte = new ArrayList<>(TOTAL_DE_CARTAS);

        // para cada naipe faça
        for (String naipe : NAIPES) {
            //  para cada valor faça
            for (String valor : VALORES) {
                //      crie uma Carta com naipe e valor e
                Carta c = new Carta(naipe, valor);
                //      insira no monte (monte.add(...))
                monte.add(c);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(monte);
        cartaAtual = 0;
    }

    // retorna a carta na Lista "monte" indicada pela posição cartaAtual
    public Carta distribuir() {
        // se monte vazio
        // levantar uma exceção dizendo que não existem mais cartas no baralho.
        if (monte.isEmpty()) {
            throw new IndexOutOfBoundsException("O baralho está vazio.");
        }

        // se não estiver vazio
        // retorna a Carta na parte superior e incrementa cartaAtual
        return monte.get(cartaAtual++);
    }
}
