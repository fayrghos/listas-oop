public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alex", 20);
        Politico politico = new Politico("Bianca", 25, "PB");
        Prefeito prefeito = new Prefeito("Carlos", 30, "PC", "Natal");
        Governador governador = new Governador("Danilo", 40, "PD", "Paraíba");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
