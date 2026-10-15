import java.util.ArrayList;

public class IteradorSaude implements IteradorSinistro {

    private ArrayList<Sinistro> sinistros;
    private int posicao = 0;

    public IteradorSaude(ArrayList<Sinistro> sinistros) {
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