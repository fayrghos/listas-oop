package lista01.q03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um ângulo em graus: ");
        double graus = scan.nextDouble();
        scan.close();

        System.out.println();
        double radianos = Math.toRadians(graus);
        System.out.printf("Radianos: %.2f\n", radianos);

        System.out.printf("Seno: %.2f\n", Math.sin(radianos));
        System.out.printf("Cosseno: %.2f\n", Math.cos(radianos));
        System.out.printf("Tangente: %.2f\n", Math.tan(radianos));

        System.out.printf("Cossecante: %.2f\n", 1 / Math.sin(radianos));
        System.out.printf("Secante: %.2f\n", 1 / Math.cos(radianos));
        System.out.printf("Cotangente: %.2f\n", 1 / Math.tan(radianos));
    }
}
