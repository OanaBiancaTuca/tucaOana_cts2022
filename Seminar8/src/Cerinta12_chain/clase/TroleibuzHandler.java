package Cerinta12_chain.clase;

public class TroleibuzHandler extends Handler{
    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta<limita){
            System.out.println("Poti sa folosesti troleibuzul");
        }else{
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
