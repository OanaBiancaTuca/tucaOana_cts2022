package cerinta11_observer.clase;

public class Calator implements  ICalator {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(nume+" s primit urmatorul mesaj: "+mesaj);
    }
}
