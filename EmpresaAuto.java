public class EmpresaAuto implements EmpresaSkibidi {

    private Sinistro[] sinistros;

    public EmpresaAuto(Sinistro[] sinistros) {
        this.sinistros = sinistros;
    }

    @Override
    public IteradorSinistro criarIterador() {
        return new IteradorAuto(sinistros);
    }
}