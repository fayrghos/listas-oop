package classes1.q03;

public class Principal {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(100, "Alex", 7F, 7F, 6F);

        if (aluno.provaFinal(5F) >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
