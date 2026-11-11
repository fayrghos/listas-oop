package classes2.q03;

public class Principal {

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
