package lista03.q07;

public class Main {

    public static void main(String[] args) {
        Generica<String> genString = new Generica<>("A", "B", "C");
        System.out.println(genString.contarIguais());
        genString.imprimirTodos();

        System.out.println();

        Generica<Integer> genInt = new Generica<>(10, 10, 10);
        System.out.println(genInt.contarIguais());
        genInt.imprimirTodos();
    }
}
