import java.util.LinkedList;

public class IteradorCapitalizacao implements IteradorSinistro {

    private LinkedList<Sinistro> sinistros;
    private int posicao = 0;

    public IteradorCapitalizacao(LinkedList<Sinistro> sinistros) {
        this.sinistros = sinistros;
    }

    @Override
    public boolean temProximo() {
        return posicao < sinistros.size();
    }

    @Override
    public Sinistro proximo() {
        return sinistros.get(posicao++);
    }
}