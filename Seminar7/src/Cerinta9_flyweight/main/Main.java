package Cerinta9_flyweight.main;

import Cerinta9_flyweight.clase.Autobuz;
import Cerinta9_flyweight.clase.AutobuzLinie;
import Cerinta9_flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1=new Autobuz("model1",2020,290);
        AutobuzLinie a2=new Autobuz("model2",2018,190);
        AutobuzLinie a3=new Autobuz("model3",2020,290);
        AutobuzLinie a4=new Autobuz("model4",2021,90);

        FlyweightFactory factory=new FlyweightFactory();

        a1.afiseazaDescriere(factory.getLinie(163));
        a2.afiseazaDescriere(factory.getLinie(226));
        a3.afiseazaDescriere(factory.getLinie(163));
        a4.afiseazaDescriere(factory.getLinie(137));

    }
}
