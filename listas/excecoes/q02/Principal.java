package excecoes.q02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String[] mesesAno = {
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro",
        };

        Scanner scan = new Scanner(System.in);
        int mesDigitado;

        for (;;) {
            try {
                System.out.print("Insira o número de um mês: ");
                mesDigitado = scan.nextInt();

                if (mesDigitado < 1 || mesDigitado > 12) {
                    throw new IndexOutOfBoundsException();
                }

                break;
            } catch (IndexOutOfBoundsException err) {
                System.out.println("Insira um número entre 1 e 12!");
            }
        }

        System.out.printf("Mês escolhido: %s\n", mesesAno[mesDigitado - 1]);
        scan.close();
    }
}
