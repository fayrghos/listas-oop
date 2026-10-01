public class Matriz {

    private float[][] elementos;

    public Matriz(int a1, int a2, int b1, int b2) {
        this.elementos = new float[2][2];

        elementos[0][0] = a1;
        elementos[0][1] = a2;
        elementos[1][0] = b1;
        elementos[1][1] = b2;
    }

    public float calcularDeterminante() {
        return (
            elementos[0][0] * elementos[1][1] -
            elementos[0][1] * elementos[1][0]
        );
    }

    public void imprimir() {
        System.out.printf(
            "%.2f\t%.2f\n%.2f\t%.2f\n",
            elementos[0][0],
            elementos[0][1],
            elementos[1][0],
            elementos[1][1]
        );
    }
}
