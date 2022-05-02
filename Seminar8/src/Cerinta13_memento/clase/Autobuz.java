package Cerinta13_memento.clase;

public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private int anFabricatie;
    private String model;

    public Autobuz(String numeSofer, float consumMediu, int anFabricatie, String model) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.anFabricatie = anFabricatie;
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", anFabricatie=" + anFabricatie +
                ", model='" + model + '\'' +
                '}';
    }
    public void  setMemento(Memento memento){
        this.numeSofer=memento.getNumeSofer();
        this.consumMediu=memento.getConsumMediu();

    }
    public Memento createMemento(){
        Memento memento= new Memento(this.numeSofer,this.consumMediu);
        return memento;
    }
}
