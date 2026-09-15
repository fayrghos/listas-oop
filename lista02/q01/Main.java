package lista02.q01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Campeonato Carioca");

        Time flamengo = new Time("Flamengo", 1895, 24, "Quartas");
        System.out.println(flamengo);

        Time fluminense = new Time("Fluminense", 1902, 24, "Quartas");
        System.out.println(fluminense);

        Time botafogo = new Time("Botafogo", 1894, 24, "Quartas");
        System.out.println(botafogo);

        Time vasco = new Time("Vasco", 1889, 24, "Quartas");
        vasco.eliminar();
        System.out.println(vasco);
    }
}
