package lista03.q03;

public class Main {

    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        lamp.mostraEstado();

        lamp.acende();
        lamp.mostraEstado();

        lamp.acende();
        lamp.mostraEstado();

        lamp.apaga();
        lamp.mostraEstado();

        lamp.acende();
        lamp.mostraEstado();
    }
}
