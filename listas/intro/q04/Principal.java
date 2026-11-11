package intro.q04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um valor em Celsius: ");
        double grausCelsius = scan.nextDouble();
        scan.close();

        System.out.printf(
            "Valor em Fahrenheit: %.1f F°\n",
            grausCelsius * 1.8 + 32
        );
    }
}
