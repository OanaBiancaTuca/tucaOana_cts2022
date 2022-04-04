package Cerinta2_prototype.clase;

public class Tramvai implements  MijlocTransport{
    private  String numeVatman;

    public Tramvai(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public String toString() {
        return "Tramvai{" +
                "numeVatman='" + numeVatman + '\'' +
                '}';
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }
}
