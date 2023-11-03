import java.util.LinkedList;

public class Tabuleiro {

    private LinkedList<Cava> cavas;

    public Tabuleiro() {
        cavas = new LinkedList<>();
    }

    public LinkedList<Cava> cavas() {
        return cavas;
    }
}
