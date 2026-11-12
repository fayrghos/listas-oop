package colecoes.q01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {

    public static LinkedList<Character> reverter(LinkedList<Character> lista) {
        LinkedList<Character> saida = new LinkedList<>();

        ListIterator<Character> iter = lista.listIterator();

        while (iter.hasNext()) {
            saida.addFirst(iter.next());
        }

        return saida;
    }

    public static void main(String[] args) {
        LinkedList<Character> lista1 = new LinkedList<>(
            Arrays.asList('C', 'h', 'o', 'c', 'o', 'l', 'a', 't', 'e', '!')
        );

        LinkedList<Character> lista2 = reverter(lista1);

        System.out.println(lista1);
        System.out.println(lista2);
    }
}
