public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro("Branca de Neve", "Disney", 1920);
        Livro livroLiv = new LivroLivraria("1984", "George Orwell", 1940, 50f);
        Livro livroBib = new LivroBiblioteca(
            "O Estrangeiro",
            "Albert Camus",
            1942,
            "Novela"
        );

        System.out.println(livro);
        System.out.println(livroLiv);
        System.out.println(livroBib);
    }
}
