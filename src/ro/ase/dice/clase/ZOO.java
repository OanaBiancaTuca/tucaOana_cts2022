package ro.ase.dice.clase;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZoo ingrijitor;
    private List<Animal> animale;

    public ZOO(String nume, IngrijitorZoo ingrijitor) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = new ArrayList<Animal>();
    }
    public void adaugaAnimal(Animal animal){
        this.animale.add(animal);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(IngrijitorZoo ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }
    public void hranesteAnimale(String mancare){
         for(Animal animal:this.animale) {
             this.ingrijitor.hranesteAnimal(animal,mancare);
         }

    }


}
