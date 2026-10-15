public class Main {

    public static void main(String[] args) {
        Assistente alex = new Assistente("Alex", 2000, 110);
        System.out.println(alex);

        Tecnico bianca = new Tecnico("Bianca", 3000, 220, 200);
        System.out.println(bianca);

        Administrativo carlos = new Administrativo(
            "Carlos",
            3500,
            330,
            "dia",
            200
        );
        System.out.println(carlos);

        Administrativo danilo = new Administrativo(
            "Danilo",
            3500,
            440,
            "noite",
            200
        );
        System.out.println(danilo);
    }
}
