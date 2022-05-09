package state_15.clase;

public class StareInService implements  Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" intra in service");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate fi trimis in service");
        }
    }
}
