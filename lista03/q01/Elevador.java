package lista03.q01;

public class Elevador {

    public int andarAtual;
    public int andarMaximo;
    public int pessoasPresentes;
    public int pessoasMaximo;

    public Elevador(int andarMaximo, int pessoasMaximo) {
        this.andarMaximo = andarMaximo;
        this.pessoasMaximo = pessoasMaximo;

        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (this.pessoasPresentes < this.pessoasMaximo) {
            this.pessoasPresentes++;
        }
    }

    public void sai() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
        }
    }

    public void sobe() {
        if (this.andarAtual < this.andarMaximo) {
            this.andarAtual++;
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Andar: %d, Pessoas: %d, Máx. Andar: %d, Máx. Pessoas: %d",
            this.andarAtual,
            this.pessoasPresentes,
            this.andarMaximo,
            this.pessoasMaximo
        );
    }
}
