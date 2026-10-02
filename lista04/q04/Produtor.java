public class Produtor {

    public static float calcularProduto(float... numeros) {
        float produto = 1;

        for (float numero : numeros) {
            produto *= numero;
        }

        return produto;
    }
}
