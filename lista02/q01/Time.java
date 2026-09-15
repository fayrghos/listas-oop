package lista02.q01;

public class Time {

    public String nome;
    public int anoFundacao;
    public int tamanhoElenco;
    public String estadoAtual;

    public Time(
        String nome,
        int anoFundacao,
        int tamanhoElenco,
        String estadoAtual
    ) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.tamanhoElenco = tamanhoElenco;
        this.estadoAtual = estadoAtual;
    }

    public void eliminar() {
        this.estadoAtual = "Eliminado";
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s, Fundação: %d, Elenco: %d, Estado: %s",
            this.nome,
            this.anoFundacao,
            this.tamanhoElenco,
            this.estadoAtual
        );
    }
}
