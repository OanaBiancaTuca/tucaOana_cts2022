package Cerinta7_decorator.clase;

public class PrinterBiletConcret implements  PrinterBilet{
    private String dataEliberarii;
    private int pret;

    public PrinterBiletConcret(String dataEliberarii, int pret) {
        this.dataEliberarii = dataEliberarii;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "PrinterBiletConcret{" +
                "dataEliberarii='" + dataEliberarii + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }
}
