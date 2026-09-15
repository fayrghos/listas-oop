package lista03.q01;

public class Main {

    public static void main(String[] args) {
        Elevador elev = new Elevador(5, 8);
        System.out.println(elev);

        elev.entra();
        System.out.println(elev);

        elev.sobe();
        System.out.println(elev);

        elev.sai();
        System.out.println(elev);

        elev.desce();
        System.out.println(elev);
    }
}
