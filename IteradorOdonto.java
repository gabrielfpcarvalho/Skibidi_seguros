import java.util.HashMap;
import java.util.Iterator;

public class IteradorOdonto implements IteradorSinistro {

    private Iterator<Sinistro> iterador;

    public IteradorOdonto(HashMap<String, Sinistro> sinistros) {
        this.iterador = sinistros.values().iterator();
    }

    @Override
    public boolean temProximo() {
        return iterador.hasNext();
    }

    @Override
    public Sinistro proximo() {
        return iterador.next();
    }
}