package lista01.q14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o N-ézimo número de Fibonacci: ");
        int n = scan.nextInt();
        scan.close();

        System.out.printf("O N-ézimo número é: %d.\n", calcFibo(n));
    }

    public static int calcFibo(int n) {
        if (n <= 1) {
            return n;
        }

        return calcFibo(n - 1) + calcFibo(n - 2);
    }
}
