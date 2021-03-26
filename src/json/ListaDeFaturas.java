package json;

import fatura.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ListaDeFaturas {
    private List<Fatura> faturas;

    public ListaDeFaturas() {
        faturas = new ArrayList<>();
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }

    public double totalDeFaturas() {
        double total = 0;
        for (Fatura f : faturas) {
            total += f.totalFaturado();
        }

        return total;
    }

    public int quantidadeDeFaturas() {
        return faturas.size();
    }
}
