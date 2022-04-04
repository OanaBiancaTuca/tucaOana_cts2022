package clase;

public class Main {
    public static void afisareMijlocTransport(Factory fact,String nrInmatriculare){
        MijlocTransport mijlocTransport =fact.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();

    }


    public static void main(String[] args){
        afisareMijlocTransport(new AutobuzFactory(),"B-12-BBB");
        MijlocTransport troleibuz=new TroleibuzFactory().getMijlocTransport("B123456");
        troleibuz.afiseazaDescriere();
        new TramvaiFactory().getMijlocTransport("B234567").afiseazaDescriere();
    }



}
