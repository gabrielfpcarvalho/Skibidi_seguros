public class SistemaCentral {

    public void gerarRelatorio(String nomeEmpresa, EmpresaSkibidi empresa) {

        System.out.println("\n--- " + nomeEmpresa + " ---");

        IteradorSinistro iterador = empresa.criarIterador();

        while (iterador.temProximo()) {
            Sinistro sinistro = iterador.proximo();

            System.out.println("- " + sinistro.getDescricao());
        }
    }
}