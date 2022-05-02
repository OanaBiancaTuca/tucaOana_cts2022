package Cerinta14_template.main;

import Cerinta14_template.clase.MijlocTransportPeSine;
import Cerinta14_template.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine mijlocTransportPeSine=new Tramvai();
        mijlocTransportPeSine.parcurgeTraseu();
        mijlocTransportPeSine.parcurgeTraseuInvers();

//        mijlocTransportPeSine.oprireStatia2();//nu am voie pt ca trebuie parcursi pasii si pt asta metoda nu trebuie sa fie publica-->le facem protected


    }
}
