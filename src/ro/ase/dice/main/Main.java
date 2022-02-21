package ro.ase.dice.main;

import ro.ase.dice.clase.*;

public  class Main {
    public static void main(String[] args){
        IngrijitorZoo ingrijitor=new IngrijitorZoo("Marius");
        Zebra z1=new Zebra("Elena");
        Zebra z2=new Zebra("Alexandru");
        Elefant e1=new Elefant("Alexandra");
        Elefant e2=new Elefant("Gigel");
        ZOO zoo=new ZOO("Bucuresti ZOO",ingrijitor);
        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);
        zoo.hranesteAnimale("banane");
    }
}
