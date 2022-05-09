package state_15.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz( int nrAutobuz) {
       this.stare = new StareLaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }
    public void pleacaInCursa(){
       StareInCursa stareInCursa=new StareInCursa();
       stareInCursa.doAction(this);

    }
    public void intraInService(){
        StareInService stareInService=new StareInService();
        stareInService.doAction(this);

    }
    public void ieseDinService(){
        StareLaCapatDeLinie stareLaCapatDeLinie=new StareLaCapatDeLinie();
        stareLaCapatDeLinie.doAction(this);

    }
    public void ajungeCapatLinie(){
        StareLaCapatDeLinie stareLaCapatDeLinie=new StareLaCapatDeLinie();
        stareLaCapatDeLinie.doAction(this);

    }
}
