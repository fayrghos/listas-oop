public class DataHora {

    protected int dia;
    protected int mes;
    protected int ano;

    protected int hora;
    protected int minuto;

    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return String.format(
            "%02d/%02d/%04d %02d:%02d",
            this.dia,
            this.mes,
            this.ano,
            this.hora,
            this.minuto
        );
    }
}
