package Cerinta10_strategy.clase;

public class Validator {
   private  ModPlata modPlata;
    private float pret;

    public Validator( float pret) {
        this.modPlata =new CardStb();
        this.pret = pret;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void valideazaCalatorie(){
        this.modPlata.plateste(this.pret);
    }
}
