package main;

import simple_factory.FabricaMijlocTransport;
import simple_factory.MijlocTransport;
import simple_factory.TipMijlocTransport;
import singleton.Singleton;

public class Main {


    public static  void main(String []args){
        //SINGLETON
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println(s1);
        System.out.println(s2);


        //SIMPLE FACTORY
        MijlocTransport autobuz= FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz,"999999999") ;
        MijlocTransport troleibuz= FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz,"11111111") ;
        MijlocTransport tramvai= FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai,"2222222") ;

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());

    }
}
