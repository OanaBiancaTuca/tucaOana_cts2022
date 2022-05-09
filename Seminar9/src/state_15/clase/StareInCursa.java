package state_15.clase;

public class StareInCursa implements Stare{

    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" pleaca in cursa");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate sa plece in cursa");
        }
    }
}
