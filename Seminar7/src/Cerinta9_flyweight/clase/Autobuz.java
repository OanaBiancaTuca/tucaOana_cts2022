package Cerinta9_flyweight.clase;

public class Autobuz implements AutobuzLinie {
    private String model;
    private int anFabricatie;
    private int nrLOcuri;

    public Autobuz(String model, int anFabricatie, int nrLOcuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLOcuri = nrLOcuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLOcuri=" + nrLOcuri +
                '}';
    }

    @Override
    public void afiseazaDescriere(Linie linie) {
        System.out.println(this.toString()+ linie.toString());
    }
}
