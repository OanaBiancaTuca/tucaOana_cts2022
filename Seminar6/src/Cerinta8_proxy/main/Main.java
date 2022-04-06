package Cerinta8_proxy.main;

import Cerinta8_proxy.clase.Autobuz;
import Cerinta8_proxy.clase.AutobuzDeNoapte;
import Cerinta8_proxy.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(5,434);
//        autobuz.opresteInstatie();
//        autobuz.setNrCalatori(0);
//        autobuz.opresteInstatie();

        AutobuzDeNoapte autobuzDeNoapte=new AutobuzDeNoapte(autobuz);
        autobuzDeNoapte.setNrCalatori(2);
        autobuzDeNoapte.opresteInstatie();
        autobuzDeNoapte.setNrCalatori(0);
        autobuzDeNoapte.opresteInstatie();
    }
}
