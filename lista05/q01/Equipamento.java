public class Equipamento {

    private String cpu;
    private int ram;

    public Equipamento(String cpu, int ram) {
        cpu(cpu);
        ram(ram);
    }

    public void cpu(String novaCpu) {
        cpu = novaCpu;
    }

    public String cpu() {
        return cpu;
    }

    public void ram(int novaRam) {
        ram = novaRam;
    }

    public int ram() {
        return ram;
    }

    @Override
    public String toString() {
        return String.format("CPU: %s, RAM: %d gb", cpu, ram);
    }
}
