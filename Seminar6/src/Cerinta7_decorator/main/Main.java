package Cerinta7_decorator.main;

import Cerinta7_decorator.clase.PrinterBilet;
import Cerinta7_decorator.clase.PrinterBiletConcret;
import Cerinta7_decorator.clase.decorator.Decorator;
import Cerinta7_decorator.clase.decorator.PrinterMesajPaste;
import Cerinta7_decorator.clase.decorator.PrinterMesajSpecial;

public class Main {
    public static void main(String[] args) {
//        PrinterBilet printerBilet =new PrinterBiletConcret("1/12/2022",10);
//        printerBilet.afiseazaDescriere();
//
//        Decorator decorator=new PrinterMesajSpecial(printerBilet);
//        decorator.afiseazaDescriere();
//        decorator.afiseazaVerso();

        PrinterBilet printerBilet1 =new PrinterBiletConcret("17/04/2022",8);
        printerBilet1.afiseazaDescriere();

        Decorator decorator1=new PrinterMesajPaste(printerBilet1);
        decorator1.afiseazaDescriere();
         decorator1.afiseazaVerso();


    }
}
