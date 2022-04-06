package Cerinta7_decorator.clase.decorator;

import Cerinta7_decorator.clase.PrinterBilet;

public class PrinterMesajSpecial extends Decorator{
    public PrinterMesajSpecial(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("La multi ani!");
    }
}
