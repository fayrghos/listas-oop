public class EntradaEmAgenda {

    private int hora;
    private int dia;
    private int mes;
    private int ano;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format(
            "Hora: %d, Dia: %d, Mês: %d, Ano: %d",
            hora,
            dia,
            mes,
            ano
        );
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return dia == this.dia && mes == this.mes && ano == this.ano;
    }
}
