import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] somas = new int[13];

        for (int i = 0; i < 36_000_000; i++) {
            int somaDados = rand.nextInt(1, 7) + rand.nextInt(1, 7);
            somas[somaDados]++;
        }

        for (int i = 2; i < 13; i++) {
            System.out.printf("Somas '%d': %d\n", i, somas[i]);
        }
    }
}
