package simple_factory;

public class Troleibuz extends  MijlocTransport{
    public Troleibuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz{}"+super.toString();
    }
}
