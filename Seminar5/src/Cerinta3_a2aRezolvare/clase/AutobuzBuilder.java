package Cerinta3_a2aRezolvare.clase;

public class AutobuzBuilder implements Builder{
    private String numeSofer;
    private String nrInmatriculare;
    private String numarLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textulDerulat;
    private int numarLocuri;

    @Override
    public Autobuz build() {
        Autobuz autobuz=new Autobuz(this.numeSofer,this.nrInmatriculare,this.numarLinie,this.openDoors,
                this.oprireCapatLinie,this.textulDerulat,this.numarLocuri);
        return  autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilder setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
        return this;
    }

    public AutobuzBuilder setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return this;
    }

    public AutobuzBuilder setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
        return this;
    }

    public AutobuzBuilder setTextulDerulat(String textulDerulat) {
        this.textulDerulat = textulDerulat;
        return this;
    }

    public AutobuzBuilder setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
        return this;
    }
}
