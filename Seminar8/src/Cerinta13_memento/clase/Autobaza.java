package Cerinta13_memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobaza {
    private List<Memento> listaMemento;

    public Autobaza() {
        this.listaMemento = new ArrayList<>() ;

    }
    public void adaugaMemento(Memento memento){
        listaMemento.add(memento);
    }
    public Memento getMemento(int index){
        return listaMemento.get(index);
    }
}
