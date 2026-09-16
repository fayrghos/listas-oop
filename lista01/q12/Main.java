package lista01.q12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o dia de Fevereiro desejado: ");
        int dia = scan.nextInt();
        scan.close();

        String nomeDia = "";
        switch ((dia - 1) % 7) {
            case 0 -> {
                nomeDia = "Domingo";
            }
            case 1 -> {
                nomeDia = "Segunda";
            }
            case 2 -> {
                nomeDia = "Terça";
            }
            case 3 -> {
                nomeDia = "Quarta";
            }
            case 4 -> {
                nomeDia = "Quinta";
            }
            case 5 -> {
                nomeDia = "Sexta";
            }
            case 6 -> {
                nomeDia = "Sábado";
            }
            default -> {
                nomeDia = "Inválido";
            }
        }

        System.out.printf("Dia %d de Feveiro será %s!\n", dia, nomeDia);
    }
}
