public class Funcionario {

    protected String nome;
    protected float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float aumento) {
        salario += aumento;
    }

    public float ganhoAnual() {
        return salario * 13;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s, Salário: %.2f, Ganho Anual %.2f",
            nome,
            salario,
            ganhoAnual()
        );
    }
}
