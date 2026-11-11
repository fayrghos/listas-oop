package abstratas.q04;

import abstratas.q03.Circulo;
import abstratas.q03.Quadrado;
import abstratas.q03.Triangulo;

public class Principal {

    public static void main(String[] args) {
        Desenho desenho1 = new Desenho(
            new Circulo(),
            new float[] { 0, 1 },
            new Triangulo(),
            new float[] { 1, 1 }
        );
        Desenho desenho2 = new Desenho(
            new Quadrado(),
            new float[] { 3, 3 },
            new Triangulo(),
            new float[] { 5, 5 }
        );

        desenho1.apresenta();
        System.out.println();
        desenho2.apresenta();
    }
}
