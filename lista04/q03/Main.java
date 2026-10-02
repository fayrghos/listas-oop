import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("--- CADASTRAR CLIENTES ---");
        for (;;) {
            System.out.println(
                "Digite um ID positivo para cadastrar um cliente ou negativo para parar."
            );

            System.out.print("Número: ");
            int idCliente = scan.nextInt();

            if (idCliente < 0) {
                break;
            }

            System.out.print("Nome: ");
            String nomeCliente = scan.next();

            System.out.print("Idade: ");
            int idadeCliente = scan.nextInt();

            System.out.print("Telefone: ");
            String telefoneCliente = scan.next();

            clientes.add(
                new Cliente(
                    idCliente,
                    nomeCliente,
                    idadeCliente,
                    telefoneCliente
                )
            );

            System.out.println("--- CLIENTE CADASTRADO ---");
            System.out.println();
        }
        scan.close();

        System.out.println();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
