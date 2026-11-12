package excecoes.q01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static Scanner scan = new Scanner(System.in);

    public static int obterIntValido() {
        int saida;
        for (;;) {
            try {
                System.out.print("Insira um número: ");
                saida = scan.nextInt();
                break;
            } catch (InputMismatchException err) {
                System.out.println("Insira um número inteiro válido.");
            }
        }

        return saida;
    }

    public static void main(String[] args) {
        System.out.printf(
            "Resultado da Soma: %d\n",
            obterIntValido() + obterIntValido()
        );
    }
}
