package lista01.q11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira as coordernadas x1 e y1: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.print("Insira as coordernadas x2 e y2: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        scan.close();

        String horizoString = "";
        String verticaString = "";

        if (x1 > x2) {
            horizoString = "esquerda";
        } else {
            horizoString = "direita";
        }

        if (y1 > y2) {
            verticaString = "abaixo";
        } else {
            verticaString = "acima";
        }

        System.out.println();
        System.out.printf(
            "O segundo ponto está à %s e %s do primeiro.\n",
            horizoString,
            verticaString
        );
    }
}
