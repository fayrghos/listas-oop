package lista03.q05;

public class Comparador {

    public static int maior(int... numeros) {
        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public static double maior(double... numeros) {
        double maior = numeros[0];

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }
}
