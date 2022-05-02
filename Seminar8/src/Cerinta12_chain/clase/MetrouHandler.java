package Cerinta12_chain.clase;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta<limita){
            System.out.println("Poti sa folosesti metroul");
        }else{
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
