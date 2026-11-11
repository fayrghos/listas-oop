package arrays.q02;

public class Principal {

    public static void main(String[] args) {
        Matriz matriz = new Matriz(1, 2, 3, 4);
        System.out.println(matriz.calcularDeterminante());
        matriz.imprimir();
    }
}
