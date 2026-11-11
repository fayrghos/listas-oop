package abstratas.q05;

public class Livro {

    private String titulo;
    private String autor;

    public int numeroDePaginas;
    public int anoDaEdicao;

    public Livro(
        String titulo,
        String autor,
        int numeroDePaginas,
        int anoDaEdicao
    ) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualAutor() {
        return this.autor;
    }

    public String qualTitulo() {
        return this.titulo;
    }

    @Override
    public String toString() {
        return String.format(
            "Livro: %s, Autor: %s, Q. Páginas: %d, Ano: %d",
            qualTitulo(),
            qualAutor(),
            numeroDePaginas,
            anoDaEdicao
        );
    }
}
