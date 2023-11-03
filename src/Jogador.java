public class Jogador {

    private final String nome;
    private int pontos;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String nome() {
        return nome;
    }

    public int pontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
