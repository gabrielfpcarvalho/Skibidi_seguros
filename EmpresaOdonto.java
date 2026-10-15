import java.util.HashMap;

public class EmpresaOdonto implements EmpresaSkibidi {

    private HashMap<String, Sinistro> sinistros;

    public EmpresaOdonto(HashMap<String, Sinistro> sinistros) {
        this.sinistros = sinistros;
    }

    @Override
    public IteradorSinistro criarIterador() {
        return new IteradorOdonto(sinistros);
    }
}