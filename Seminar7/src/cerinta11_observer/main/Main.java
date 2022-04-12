package cerinta11_observer.main;

import cerinta11_observer.clase.Calator;
import cerinta11_observer.clase.ICalator;
import cerinta11_observer.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport=new MijlocTransport(137);
        ICalator c1=new Calator("Ion");
        ICalator c2=new Calator("Gigi");
        ICalator c3=new Calator("Ana");
        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);
        mijlocTransport.trimiteMesajPlecareCapatLinie();

        System.out.println();
        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);
        mijlocTransport.trimiteMesajPlecareCapatLinie();

    }
}
