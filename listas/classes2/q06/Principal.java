package classes2.q06;

public class Principal {

    public static void main(String[] args) {
        RegistroAcademico reg1 = new RegistroAcademico("Alex", 10, 0.1F);
        System.out.println(reg1.matricula);

        RegistroAcademico reg2 = new RegistroAcademico("Bianca", 10, 0.1F);
        System.out.println(reg2.matricula);

        RegistroAcademico reg3 = new RegistroAcademico("Carlos", 10, 0.1F);
        System.out.println(reg3.matricula);
    }
}
