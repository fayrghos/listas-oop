package lista03.q02;

public class Contador {

    private int contagem;

    public void zerar() {
        this.contagem = 0;
    }

    public void incrementar() {
        this.contagem++;
    }

    public void imprimir() {
        System.out.printf("Valor: %d\n", contagem);
    }
}
