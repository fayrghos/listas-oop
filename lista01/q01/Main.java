package lista01.q01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o tamanho do lado do quadrado: ");
        int lado = scan.nextInt();
        scan.close();

        System.out.printf("Área do quadrado: %.0f\n", Math.pow(lado, 2));
    }
}
