package lista01.q07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o número %d: ", i + 1);
            numeros[i] = scan.nextInt();
        }
        scan.close();

        int maior = numeros[0];
        for (int i = 1; i < 3; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.printf("Maior: %d\n", maior);
    }
}
