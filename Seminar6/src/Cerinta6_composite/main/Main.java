package Cerinta6_composite.main;

import Cerinta6_composite.clase.Autobuz;
import Cerinta6_composite.clase.Grup;
import Cerinta6_composite.clase.MijlocTransport;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        MijlocTransport a1=new Autobuz("Stb","Mercedes",10);
        MijlocTransport a2=new Autobuz("RATB","OTOKAR",7);
        MijlocTransport a3=new Autobuz("PTB","Mercedes",45);
        MijlocTransport g1=new Grup("Mici");
        MijlocTransport g2=new Grup("Medii");
        MijlocTransport g3=new Grup("Flota");

        try {
            g1.adaugaMijlocTransport(a1);
            g1.adaugaMijlocTransport(a2);
            g2.adaugaMijlocTransport(a3);
            g3.adaugaMijlocTransport(g1);
            g3.adaugaMijlocTransport(g2);
        } catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }

        g3.afiseazaDescriere();
    }
}
