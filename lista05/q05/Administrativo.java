public class Administrativo extends Assistente {

    private String turno;
    private float adicional;

    public Administrativo(
        String nome,
        float salario,
        int matricula,
        String turno,
        float adicional
    ) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicional = adicional;
    }

    @Override
    public float ganhoAnual() {
        return (
            super.ganhoAnual() + (turno.equals("noite") ? adicional * 12 : 0)
        );
    }
}
