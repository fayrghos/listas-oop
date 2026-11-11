package classes1.q02;

public class Principal {

    public static void main(String[] args) {
        Fatura notebooks = new Fatura(1, "Notebooks usados.", 3, 1200F);

        System.out.println(notebooks.calculaTotal());
    }
}
