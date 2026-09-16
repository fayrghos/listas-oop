package lista01.q08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o setor da loja: ");
        int codSetor = scan.nextInt();

        float valorProduto = 0;

        if (codSetor == 111) {
            System.out.print("Insira o valor do produto: ");
            valorProduto = scan.nextFloat();
            scan.close();

            if (valorProduto > 100) {
                valorProduto *= 0.6;
            } else if (valorProduto > 50) {
                valorProduto *= 0.8;
            } else {
                valorProduto *= 0.9;
            }
        } else if (codSetor == 222) {
            System.out.print("Insira o valor do produto: ");
            valorProduto = scan.nextFloat();
            scan.close();

            if (valorProduto > 500) {
                valorProduto *= 0.9;
            }
        } else {
            scan.close();
            System.out.println("Setor Inválido!");
        }

        System.out.println();
        System.out.printf("Setor: %s\n", codSetor == 111 ? "Cama" : "Eletros");
        System.out.printf("Valor do Produto: R$ %.2f\n", valorProduto);
    }
}
