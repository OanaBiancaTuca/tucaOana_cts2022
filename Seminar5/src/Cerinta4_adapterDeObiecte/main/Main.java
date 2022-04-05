package Cerinta4_adapterDeObiecte.main;

import Cerinta4_adapterDeObiecte.clase.Metrou.ValidatorScanare;
import Cerinta4_adapterDeObiecte.clase.STB.ValidatorAdapter;

public class Main {
    public static void main(String[] args){
        ValidatorScanare scanare=new ValidatorScanare();//cream mai intai obiectul pe care il adaptam
        ValidatorAdapter adaptor=new ValidatorAdapter(scanare);
        adaptor.valideazaAbonament();
        adaptor.valideazaBilet();


    }
}
