import java.util.Scanner;

public class Kalah {
    public static void main(String[] args) {
        // new Gui().init(750, 250, "Kalah");

        Tabuleiro t = new Tabuleiro();
        Jogo.semear(t.cavas());

        for (Cava c : t.cavas()) {
            System.out.print(c.sementes() + " | ");
        }
        System.out.println("\n");

        int i = 0;
        Scanner s = new Scanner(System.in);
        while (i != 25) {
            i = s.nextInt() - 1;    // corrige o indice de entrada
            boolean vez = Jogo.plantar(t.cavas(), i);
            System.out.println(vez);

            for (Cava c : t.cavas()) {
                System.out.print(c.sementes() + " | ");
            }
            System.out.println("\n");
        }

        s.close();
    }
}
