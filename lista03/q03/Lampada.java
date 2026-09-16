package lista03.q03;

import lista03.q02.Contador;

public class Lampada {

    public boolean estadoDaLampada;
    public Contador vezesAcesa;

    public Lampada() {
        this.estadoDaLampada = false;
        this.vezesAcesa = new Contador();
    }

    public void acende() {
        if (!this.estaLigada()) {
            this.vezesAcesa.incrementar();
        }
        this.estadoDaLampada = true;
    }

    public void apaga() {
        this.estadoDaLampada = false;
    }

    public void mostraEstado() {
        System.out.printf(
            "A lampada está %s. ",
            this.estaLigada() ? "Acesa" : "Apagada"
        );
        this.vezesAcesa.imprimir();
    }

    public boolean estaLigada() {
        return this.estadoDaLampada;
    }
}
