package Cerinta5_facade.clase;

public class Facade {
    private Autobuz autobuz;

    public Facade() {
        this.autobuz = new Autobuz();
    }
    public void deschideToateUsile(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaSpate();
        autobuz.deschideUsaMijloc();
    }
    public void elibereazaToateUsile(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }
}
