package lista01.q02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o número %d: ", i + 1);
            soma += scan.nextDouble();
        }
        scan.close();

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Média: %.2f\n", media / 3);
    }
}
