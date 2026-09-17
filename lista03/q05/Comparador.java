package lista03.q05;

public class Comparador {

    public static int maior(int a, int b) {
        return a > b ? a : b;
    }

    public static int maior(int a, int b, int c) {
        return Comparador.maior(Comparador.maior(a, b), c);
    }

    public static int maior(int a, int b, int c, int d) {
        return Comparador.maior(Comparador.maior(a, b, c), d);
    }

    public static int maior(int a, int b, int c, int d, int e) {
        return Comparador.maior(Comparador.maior(a, b, c, d), e);
    }

    public static double maior(double a, double b) {
        return a > b ? a : b;
    }

    public static double maior(double a, double b, double c) {
        return Comparador.maior(Comparador.maior(a, b), c);
    }

    public static double maior(double a, double b, double c, double d) {
        return Comparador.maior(Comparador.maior(a, b, c), d);
    }

    public static double maior(
        double a,
        double b,
        double c,
        double d,
        double e
    ) {
        return Comparador.maior(Comparador.maior(a, b, c, d), e);
    }
}
