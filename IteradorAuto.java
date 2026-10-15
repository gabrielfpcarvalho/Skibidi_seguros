public class IteradorAuto implements IteradorSinistro {

    private Sinistro[] sinistros;
    private int posicao = 0;

    public IteradorAuto(Sinistro[] sinistros) {
        this.sinistros = sinistros;
    }

    @Override
    public boolean temProximo() {
        return posicao < sinistros.length;
    }

    @Override
    public Sinistro proximo() {
        return sinistros[posicao++];
    }
}