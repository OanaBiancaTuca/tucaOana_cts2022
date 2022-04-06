package Cerinta7_decorator.clase.decorator;

import Cerinta7_decorator.clase.PrinterBilet;

public abstract class Decorator implements  PrinterBilet {
    private PrinterBilet printerBilet;

    public Decorator(PrinterBilet printerBilet) {
        this.printerBilet = printerBilet;
    }

    @Override
     public void afiseazaDescriere(){
        printerBilet.afiseazaDescriere();
    }
    public abstract void afiseazaVerso();
}
