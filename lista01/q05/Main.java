package lista01.q05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o número CDU: ");
        int cdu = scan.nextInt();
        scan.close();

        int u = cdu % 10;
        cdu /= 10;

        int d = cdu % 10;
        cdu /= 10;

        int ucd = u * 100 + cdu * 10 + d;
        System.out.println(ucd);
    }
}
