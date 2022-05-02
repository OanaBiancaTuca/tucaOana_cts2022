package Cerinta12_chain.main;

import Cerinta12_chain.clase.*;

public class Main {
    public static void main(String[] args) {
//        AutobuzHandler autobuzHandler = new AutobuzHandler(5);
//        TroleibuzHandler troleibuzHandler=new TroleibuzHandler(3);
//        TramvaiHandler tramvaiHandler=new TramvaiHandler(10);
//        MetrouHandler metrouHandler=new MetrouHandler(100);
//
//        troleibuzHandler.setHandler(autobuzHandler);
//        autobuzHandler.setHandler(tramvaiHandler);
//        tramvaiHandler.setHandler(metrouHandler);
//
//        troleibuzHandler.afisareMijlocTransport(7);
//        troleibuzHandler.afisareMijlocTransport(20);
//        troleibuzHandler.afisareMijlocTransport(2);
//        troleibuzHandler.afisareMijlocTransport(4);

        System.out.println(" de aici pt oras Cluj");
        AutobuzHandler autobuzHandler2 = new AutobuzHandler(1000);
        TroleibuzHandler troleibuzHandler2=new TroleibuzHandler(5);
        TramvaiHandler tramvaiHandler2=new TramvaiHandler(2);

        tramvaiHandler2.setHandler(troleibuzHandler2);
        troleibuzHandler2.setHandler(autobuzHandler2);

        tramvaiHandler2.afisareMijlocTransport(1);
        tramvaiHandler2.afisareMijlocTransport(3);
        tramvaiHandler2.afisareMijlocTransport(10);


    }
}
