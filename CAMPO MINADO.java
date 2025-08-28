import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando o jogo");

        boolean[][] minas = new boolean[2][2];
        Scanner teclado = new Scanner(System.in);
        Random sorteio = new Random();

        int posY = sorteio.nextInt(2);
        int posX = sorteio.nextInt(2);
        minas[posX][posY] = true;


        System.out.println("A bomba foi colocada em: " + posX + "," + posY);

        int chuteX, chuteY;

        System.out.println("Campo Minado iniciado.");

        for (int rodada = 0; rodada < minas.length * 2; rodada++) {

            System.out.print("Digite valor para X: ");
            chuteX = teclado.nextInt();

            System.out.print("Digite valor para Y: ");
            chuteY = teclado.nextInt();

            if (minas[chuteX][chuteY]) {
                System.out.println("Explodiu");
            } else {
                System.out.println("Seguro");
            }
        }

        System.out.println("Fim do jogo.");
        teclado.close();
    }
}