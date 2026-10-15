public class Assistente extends Funcionario {

    private int matricula;

    public Assistente(String nome, float salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int novaMatricula) {
        matricula = novaMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Matrícula: %d", matricula);
    }
}
