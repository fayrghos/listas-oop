public class Livro {

    public String nome;
    public String autor;
    public int anoPublicacao;

    public Livro(String nome, String autor, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s, Autor: %s, Publicação: %d",
            nome,
            autor,
            anoPublicacao
        );
    }
}
