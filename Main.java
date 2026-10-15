import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // AUTO
        Sinistro[] sinistrosAuto = {
            new Sinistro("Colisão frontal"),
            new Sinistro("Furto de veículo"),
            new Sinistro("Quebra de para-brisa")
        };

        EmpresaAuto auto = new EmpresaAuto(sinistrosAuto);


        // SAÚDE
        ArrayList<Sinistro> sinistrosSaude = new ArrayList<>();

        sinistrosSaude.add(new Sinistro("Consulta de emergência"));
        sinistrosSaude.add(new Sinistro("Exame cardiológico"));
        sinistrosSaude.add(new Sinistro("Internação hospitalar"));

        EmpresaSaude saude = new EmpresaSaude(sinistrosSaude);


        // CAPITALIZAÇÃO
        LinkedList<Sinistro> sinistrosCapitalizacao = new LinkedList<>();

        sinistrosCapitalizacao.add(new Sinistro("Resgate de título"));
        sinistrosCapitalizacao.add(new Sinistro("Pagamento de sorteio"));
        sinistrosCapitalizacao.add(new Sinistro("Cancelamento de título"));

        EmpresaCapitalizacao capitalizacao =
            new EmpresaCapitalizacao(sinistrosCapitalizacao);


        // ODONTO
        HashMap<String, Sinistro> sinistrosOdonto = new HashMap<>();

        sinistrosOdonto.put("OD001", new Sinistro("Tratamento de canal"));
        sinistrosOdonto.put("OD002", new Sinistro("Extração dentária"));
        sinistrosOdonto.put("OD003", new Sinistro("Prótese odontológica"));

        EmpresaOdonto odonto = new EmpresaOdonto(sinistrosOdonto);


        // SISTEMA CENTRAL
        SistemaCentral sistema = new SistemaCentral();

        sistema.gerarRelatorio("Skibidi Auto", auto);
        sistema.gerarRelatorio("Skibidi Saúde", saude);
        sistema.gerarRelatorio("Skibidi Capitalização", capitalizacao);
        sistema.gerarRelatorio("Skibidi Odonto", odonto);
    }
}