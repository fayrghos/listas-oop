public class EventoDelegacao {

    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(DataHora dataHora, String evento) {
        this.dataHora = dataHora;
        this.evento = evento;
    }

    @Override
    public String toString() {
        return dataHora.toString() + String.format(", %s", this.evento);
    }
}
