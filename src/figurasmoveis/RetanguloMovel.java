package figurasmoveis;

public class RetanguloMovel implements Movel {
    private PontoMovel superiorEsquerda;
    private PontoMovel inferiorDireita;

    public RetanguloMovel(int x1, int y1, int x2, int y2,
                          int velX, int velY) {
        superiorEsquerda = new PontoMovel(x1, y1, velX, velY);
        inferiorDireita = new PontoMovel(x2, y2, velX, velY);
    }

    @Override
    public String toString() {
        return "RetanguloMovel{" +
                "superiorEsquerda=" + superiorEsquerda +
                ", inferiorDireita=" + inferiorDireita +
                '}';
    }

    @Override
    public void moverParaCima() {
        superiorEsquerda.moverParaCima();
        inferiorDireita.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        superiorEsquerda.moverParaBaixo();
        inferiorDireita.moverParaBaixo();
    }

    @Override
    public void moverParaDireita() {
        superiorEsquerda.moverParaDireita();
        inferiorDireita.moverParaDireita();
    }

    @Override
    public void moverParaEsquerda() {
        superiorEsquerda.moverParaEsquerda();
        inferiorDireita.moverParaEsquerda();
    }
}
