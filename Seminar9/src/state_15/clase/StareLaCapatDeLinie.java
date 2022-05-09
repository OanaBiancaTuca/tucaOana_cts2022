package state_15.clase;

public class StareLaCapatDeLinie implements  Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if(! (autobuz.getStare() instanceof StareLaCapatDeLinie)){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este la capat de linie");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+"  este deja la capat de linie");
        }

    }
}
