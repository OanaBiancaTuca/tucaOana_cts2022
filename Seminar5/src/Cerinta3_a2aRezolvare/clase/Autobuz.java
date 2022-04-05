package Cerinta3_a2aRezolvare.clase;

public class Autobuz {
    private String numeSofer;
    private String nrInmatriculare;
    private String numarLinie;
    private Boolean deschideUsiFaraSolicitare;
    private Boolean oprireCapatLinie;
    private String model;
    private int numarLocuri;

    Autobuz(String numeSofer, String nrInmatriculare, String numarLinie, Boolean deschideUsiFaraSolicitare, Boolean oprireCapatLinie, String model, int numarLocuri) {
        this.numeSofer = numeSofer;
        this.nrInmatriculare = nrInmatriculare;
        this.numarLinie = numarLinie;
        this.deschideUsiFaraSolicitare = deschideUsiFaraSolicitare;
        this.oprireCapatLinie = oprireCapatLinie;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", numarLinie='" + numarLinie + '\'' +
                ", deschideUsiFaraSolicitare=" + deschideUsiFaraSolicitare +
                ", oprireCapatLinie=" + oprireCapatLinie +
                ", model='" + model + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}