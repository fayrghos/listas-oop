public class Funcionario {

    private String nome;
    private String cargo;
    private float salario;

    public Funcionario(String nome) {
        this.nome = nome;
        this.cargo = "Atendente";
        this.salario = 2.0f;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.cargo = "Atendente";
        this.salario = salario;
    }

    public String obterNome() {
        return nome;
    }

    public void alterarNome(String novoNome) {
        nome = novoNome;
    }

    public String obterCargo() {
        return cargo;
    }

    public void alterarCargo(String novoCargo) {
        cargo = novoCargo;
    }

    public float obterSalario() {
        return salario;
    }

    public void alterarSalario(float novoSalario) {
        salario = novoSalario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Cargo: %s, Salário: R$ %.2f", nome, cargo, salario);
    }
}
