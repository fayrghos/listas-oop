package abstratas.q05;

public interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 5;

    public boolean estaEmprestado();

    public void empresta();

    public void devolve();

    public String localizacao();

    public String descricao();
}
