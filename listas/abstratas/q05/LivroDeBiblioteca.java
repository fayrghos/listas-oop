package abstratas.q05;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    private String descricao;
    private String localizacao;
    private boolean estaEmprestado = false;

    public LivroDeBiblioteca(
        String titulo,
        String autor,
        int numeroDePaginas,
        int anoDaEdicao,
        String descricao,
        String localizacao
    ) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    @Override
    public boolean estaEmprestado() {
        return this.estaEmprestado;
    }

    @Override
    public void empresta() {
        this.estaEmprestado = true;
    }

    @Override
    public void devolve() {
        this.estaEmprestado = false;
    }

    @Override
    public String localizacao() {
        return this.localizacao;
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            String.format(
                ", Localização: %s, Descrição: %s",
                localizacao(),
                descricao()
            )
        );
    }
}
