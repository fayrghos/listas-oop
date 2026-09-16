package lista03.q06;

public class RegistroAcademico {

    public String nome;
    public String matricula;
    public int codigoCurso;
    public float percentualCobranca;

    public static int numeroDeMatriculas;

    public RegistroAcademico(
        String nome,
        int codigoCurso,
        float percentualCobranca
    ) {
        RegistroAcademico.numeroDeMatriculas++;

        this.nome = nome;
        this.matricula = String.format(
            "%d",
            RegistroAcademico.numeroDeMatriculas
        );
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
    }

    public float calculaMensalidade() {
        return 100 * codigoCurso * percentualCobranca;
    }
}
