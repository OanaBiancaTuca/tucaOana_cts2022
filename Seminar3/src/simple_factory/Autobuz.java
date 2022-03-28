package simple_factory;

public class Autobuz extends MijlocTransport{
    public Autobuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz{}"+super.toString();
    }
}
