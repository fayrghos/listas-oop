package lista02.q02;

public class Main {

    public static void main(String[] args) {
        Fatura notebooks = new Fatura(1, "Notebooks usados.", 3, 1200F);

        System.out.println(notebooks.calculaTotal());
    }
}
