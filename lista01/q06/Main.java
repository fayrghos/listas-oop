package lista01.q06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o intervalo em minutos: ");
        int intervalo = scan.nextInt();
        scan.close();

        int dias = intervalo / 1440;
        intervalo %= 1440;

        int horas = intervalo / 60;
        intervalo %= 60;

        System.out.printf(
            "Equivale a %d dias, %d horas e %d minutos\n",
            dias,
            horas,
            intervalo
        );
    }
}
