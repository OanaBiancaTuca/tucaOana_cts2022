package simple_factory;

public class Tramvai extends MijlocTransport{
    public Tramvai(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai{}"+super.toString();
    }
}
