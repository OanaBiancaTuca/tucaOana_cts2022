package Cerinta3_builder.clase;

public class Autobuz {
    private String numeSofer;
    private String nrInmatriculare;
    private String numarLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textulDerulat;
    private int numarLocuri;

     Autobuz() {
        this.numeSofer = "Doru";
        this.nrInmatriculare = "B1234";
        this.numarLinie = "54";
        this.openDoors = Boolean.TRUE;
        this.oprireCapatLinie = Boolean.TRUE;
        this.textulDerulat = "textulDerulat";
        this.numarLocuri = 20;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

     void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

     void setTextulDerulat(String textulDerulat) {
        this.textulDerulat = textulDerulat;
    }

     void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", numarLinie='" + numarLinie + '\'' +
                ", openDoors=" + openDoors +
                ", oprireCapatLinie=" + oprireCapatLinie +
                ", textulDerulat='" + textulDerulat + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}
