package arrays.q01;

public class Principal {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarCompromisso(new EntradaEmAgenda(16, 18, 11, 2005));
        agenda.adicionarCompromisso(new EntradaEmAgenda(20, 1, 4, 2010));

        agenda.listaDia(18, 11, 2005);
    }
}
