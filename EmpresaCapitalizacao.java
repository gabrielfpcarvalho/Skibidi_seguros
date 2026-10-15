import java.util.LinkedList;

public class EmpresaCapitalizacao implements EmpresaSkibidi {

    private LinkedList<Sinistro> sinistros;

    public EmpresaCapitalizacao(LinkedList<Sinistro> sinistros) {
        this.sinistros = sinistros;
    }

    @Override
    public IteradorSinistro criarIterador() {
        return new IteradorCapitalizacao(sinistros);
    }
}