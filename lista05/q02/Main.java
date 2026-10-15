public class Main {

    public static void main(String[] args) {
        EventoDelegacao eventoDel = new EventoDelegacao(
            new DataHora(20, 12, 2026, 23, 59),
            "Fim do Semestre"
        );

        EventoHeranca eventoHer = new EventoHeranca(
            1,
            4,
            2026,
            6,
            7,
            "Primeiro de Abril"
        );

        System.out.println(eventoDel);
        System.out.println(eventoHer);
    }
}
