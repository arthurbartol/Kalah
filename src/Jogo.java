import java.util.LinkedList;

public class Jogo {
    
    public static void semear(LinkedList<Cava> cavas) {
        for (int i = 1; i <= 14; i++) {
            if (i == 7 || i == 14) {
                cavas.add(new Silo());
            } else {
                cavas.add(new Cava(4));
            }
        }
    }

    public static boolean plantar(LinkedList<Cava> cavas, int i) {
        int s = cavas.get(i).sementes();
        cavas.get(i).setSementes(0); // esvazia a cava

        boolean vez = false;

        int x = i;
        for (int j = s; j > 0; j--) {

            if (x == 13) x = 0;
            else         x++;

            cavas.get(x).setSementes(cavas.get(x).sementes() + 1);
        }

        if (i < 7)
            if (x == 6)
                vez = true;

        if (i > 6)
            if (x == 13)
                vez = true;

        return vez;
    }
}
