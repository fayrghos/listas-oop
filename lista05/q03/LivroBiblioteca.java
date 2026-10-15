public class LivroBiblioteca extends Livro {

    public String setor;

    public LivroBiblioteca(
        String nome,
        String autor,
        int anoPublicacao,
        String setor
    ) {
        super(nome, autor, anoPublicacao);
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Setor: %s", setor);
    }
}
