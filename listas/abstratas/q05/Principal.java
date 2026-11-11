package abstratas.q05;

public class Principal {

    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca(
            "Don Quixote",
            "Miguel de Cervantes",
            1328,
            2024,
            "Um livro de aventura.",
            "Romance, Prateleira J"
        );

        livro.empresta();
        System.out.println(livro);
        System.out.println(livro.qualAutor());
        System.out.println(livro.estaEmprestado());
        System.out.println(livro.localizacao());

        livro.devolve();
        System.out.println(livro.estaEmprestado());
    }
}
