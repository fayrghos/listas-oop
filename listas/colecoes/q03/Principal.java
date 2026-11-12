package colecoes.q03;

import java.util.Stack;

public class Principal {

    public static boolean estaBalanceada(String entrada) {
        Stack<Character> verificador = new Stack<>();

        for (Character parentese : entrada.toCharArray()) {
            if (parentese.equals('(')) {
                verificador.push(parentese);
                continue;
            }

            if (verificador.isEmpty()) {
                return false;
            }

            verificador.pop();
        }

        return verificador.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(estaBalanceada("(()()()())"));
        System.out.println(estaBalanceada("(((())))"));
        System.out.println(estaBalanceada("(()((())()))"));
        System.out.println();
        System.out.println(estaBalanceada("((((((())"));
        System.out.println(estaBalanceada("()))"));
        System.out.println(estaBalanceada("(()()(()"));
    }
}
