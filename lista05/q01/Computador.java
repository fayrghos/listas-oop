public class Computador extends Equipamento {

    private String gpu;
    private int vram;

    public Computador(String cpu, String gpu, int ram, int vram) {
        super(cpu, ram);
        this.gpu(gpu);
        this.vram(vram);
    }

    public void gpu(String novaGpu) {
        gpu = novaGpu;
    }

    public String gpu() {
        return gpu;
    }

    public void vram(int novaVram) {
        vram = novaVram;
    }

    public int vram() {
        return vram;
    }

    @Override
    public String toString() {
        return String.format(
            "CPU: %s, GPU: %s, RAM %d, VRAM: %d gb",
            cpu(),
            gpu(),
            ram(),
            vram()
        );
    }
}
