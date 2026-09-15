package lista02.q03;

public class Aluno {

    public int matricula;
    public String nome;

    public float p1;
    public float p2;
    public float t;

    public Aluno(int matricula, String nome, float p1, float p2, float t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public float media() {
        return (2.5F * this.p1 + 2.5F * this.p2 + 2F * t) / 7;
    }

    public float provaFinal(float ef) {
        float mp = this.media();
        if (mp < 3 || mp >= 7) {
            return 0F;
        }

        return (mp * 6 + ef * 4) / 10;
    }
}
