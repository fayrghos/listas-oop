package lista01.q09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um valor para a carta [1 - 13]: ");
        int valor = scan.nextInt();

        System.out.print("Insira um naipe [1 - 4]: ");
        int naipe = scan.nextInt();
        scan.close();

        String valorString = "";
        switch (valor) {
            case 1 -> {
                valorString = "Ás";
            }
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                valorString = String.format("%d", valor);
            }
            case 11 -> {
                valorString = "Valete";
            }
            case 12 -> {
                valorString = "Rainha";
            }
            case 13 -> {
                valorString = "Rei";
            }
            default -> {
                valorString = "Inválida";
            }
        }

        String naipeString = "";
        switch (naipe) {
            case 1 -> {
                naipeString = "Ouros";
            }
            case 2 -> {
                naipeString = "Paus";
            }
            case 3 -> {
                naipeString = "Copas";
            }
            case 4 -> {
                naipeString = "Espadas";
            }
            default -> {
                naipeString = "Inválidas";
            }
        }

        System.out.printf("Sua carta é: %s de %s!\n", valorString, naipeString);
    }
}
