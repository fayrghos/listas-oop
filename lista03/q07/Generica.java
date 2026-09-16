package lista03.q07;

public class Generica<T> {

    public T atrib1;
    public T atrib2;
    public T atrib3;

    public Generica(T atrib1, T atrib2, T atrib3) {
        this.atrib1 = atrib1;
        this.atrib2 = atrib2;
        this.atrib3 = atrib3;
    }

    public int contarIguais() {
        int saida = 0;

        if (atrib1.equals(atrib2)) saida++;
        if (atrib2.equals(atrib3)) saida++;
        if (atrib1.equals(atrib3)) saida++;

        return saida;
    }

    public void imprimirTodos() {
        System.out.printf("Atributo 1: %s\n", atrib1);
        System.out.printf("Atributo 2: %s\n", atrib2);
        System.out.printf("Atributo 3: %s\n", atrib3);
    }
}
