package Cerinta4_adapterDeClase.main;

import Cerinta4_adapterDeClase.clase.STB.ValidatorAdapter;
import Cerinta4_adapterDeClase.clase.STB.ValidatorNFC;
import Cerinta4_adapterDeClase.clase.STB.ValidatorStb;

public class Main {
    private static void validareAbonamente(ValidatorStb validator){
        validator.valideazaAbonament();
    }

    public static void main(String[] args){
        ValidatorStb val=new ValidatorNFC();

        ValidatorAdapter adapter=new ValidatorAdapter();
        adapter.valideazaAbonament();
        adapter.valideazaBilet();
    }
}
