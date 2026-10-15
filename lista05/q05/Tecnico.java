public class Tecnico extends Assistente {

    private float bonus;

    public Tecnico(String nome, float salario, int matricula, float bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    @Override
    public float ganhoAnual() {
        return super.ganhoAnual() + bonus * 13;
    }
}
