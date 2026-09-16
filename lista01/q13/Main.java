package lista01.q13;

public class Main {

    public static void main(String[] args) {
        int contador = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%02d ", contador);
                contador++;
            }
            System.out.println();
        }
    }
}
