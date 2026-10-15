import java.util.ArrayList;

public class EmpresaSaude implements EmpresaSkibidi {

    private ArrayList<Sinistro> sinistros;

    public EmpresaSaude(ArrayList<Sinistro> sinistros) {
        this.sinistros = sinistros;
    }

    @Override
    public IteradorSinistro criarIterador() {
        return new IteradorSaude(sinistros);
    }
}