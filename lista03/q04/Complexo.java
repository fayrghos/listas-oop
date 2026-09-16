package lista03.q04;

public class Complexo {

    public int real = 0;
    public int imaginario = 0;

    public Complexo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo(int real) {
        this.real = real;
    }

    public Complexo() {}

    @Override
    public String toString() {
        return String.format("%d + %di", this.real, this.imaginario);
    }
}
