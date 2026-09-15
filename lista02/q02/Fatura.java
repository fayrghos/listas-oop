package lista02.q02;

public class Fatura {

    public int id;
    public String desc;
    public int quantidade;
    public float precoUnidade;

    public Fatura(int id, String desc, int quantidade, float precoUnidade) {
        this.id = id;
        this.desc = desc;

        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.precoUnidade = precoUnidade > 0 ? precoUnidade : 0F;
    }

    public float calculaTotal() {
        return this.quantidade * this.precoUnidade;
    }
}
