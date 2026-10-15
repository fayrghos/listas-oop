public class LivroLivraria extends Livro {

    public float preco;

    public LivroLivraria(
        String nome,
        String autor,
        int anoPublicacao,
        float preco
    ) {
        super(nome, autor, anoPublicacao);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Preço: R$ %.2f", preco);
    }
}
