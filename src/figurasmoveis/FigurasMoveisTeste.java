package figurasmoveis;

public class FigurasMoveisTeste {
    public static void main(String[] args) {
        String tipoFigura = args[0];
        int raio, x, y, velX, velY;
        int x1, y1, x2, y2;
        Movel figura = null; // variável que vai conter a figura

        if (tipoFigura.equals("c")) {
            raio = Integer.parseInt(args[1]);
            x = Integer.parseInt(args[2]);
            y = Integer.parseInt(args[3]);
            velX = Integer.parseInt(args[4]);
            velY = Integer.parseInt(args[5]);
            figura = new CirculoMovel(x, y, velX, velY, raio);
        } else if (tipoFigura.equals("r")) {
            x1 = Integer.parseInt(args[1]);
            y1 = Integer.parseInt(args[2]);
            x2 = Integer.parseInt(args[3]);
            y2 = Integer.parseInt(args[4]);
            velX = Integer.parseInt(args[5]);
            velY = Integer.parseInt(args[6]);
            figura = new RetanguloMovel(x1, y1, x2, y2, velX, velY);
        }

        if (figura != null) {
            System.out.println(figura);
            System.out.println("Movendo para cima.");
            figura.moverParaCima();
            System.out.println(figura);
            System.out.println("Movendo para direita.");
            figura.moverParaDireita();
            System.out.println(figura);
            System.out.println("Movendo para baixo.");
            figura.moverParaBaixo();
            System.out.println(figura);
            System.out.println("Movendo para esquerda.");
            figura.moverParaEsquerda();
            System.out.println(figura);
        }
    }
}
