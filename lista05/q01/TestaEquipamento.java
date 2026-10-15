public class TestaEquipamento {

    public static void main(String[] args) {
        Computador comp = new Computador("Core i5", "GTX 1080", 8, 6);
        Equipamento equip = new Equipamento("Ryzen 5", 16);

        System.out.println(equip);
        System.out.println(comp);
    }
}
