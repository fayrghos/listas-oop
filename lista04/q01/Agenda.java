import java.util.ArrayList;

public class Agenda {

    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda novaEntrada) {
        compromissos.add(novaEntrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada);
            }
        }
    }
}
