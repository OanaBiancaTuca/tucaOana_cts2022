package Cerinta13_memento.clase;

public class Memento {
    private String numeSofer;
    private float consumMediu;

    public Memento(String numeSofer, float consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }
}
