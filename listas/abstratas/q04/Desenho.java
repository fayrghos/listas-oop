package abstratas.q04;

import abstratas.q03.FiguraGeometrica;

public class Desenho {

    public FiguraGeometrica figura1;
    public float coordenadas1[];

    public FiguraGeometrica figura2;
    public float coordenadas2[];

    public Desenho(
        FiguraGeometrica figura1,
        float[] coordenadas1,
        FiguraGeometrica figura2,
        float[] coordenadas2
    ) {
        this.figura1 = figura1;
        this.coordenadas1 = coordenadas1;
        this.figura2 = figura2;
        this.coordenadas2 = coordenadas2;
    }

    public void apresenta() {
        System.out.printf(
            "[Figura 1] Coordenadas: (%.1f, %.1f), Descrição: ",
            coordenadas1[0],
            coordenadas1[1]
        );
        figura1.descricao();

        System.out.printf(
            "[Figura 2] Coordenadas: (%.1f, %.1f), Descrição: ",
            coordenadas2[0],
            coordenadas2[1]
        );
        figura2.descricao();
    }
}
