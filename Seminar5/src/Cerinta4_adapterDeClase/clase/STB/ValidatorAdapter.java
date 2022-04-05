package Cerinta4_adapterDeClase.clase.STB;

import Cerinta4_adapterDeClase.clase.Metrou.ValidatorScanare;

public class ValidatorAdapter extends ValidatorScanare implements ValidatorStb {
    @Override
    public void valideazaBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {

        super.valideazaAbonamentMetrou();
    }
}
