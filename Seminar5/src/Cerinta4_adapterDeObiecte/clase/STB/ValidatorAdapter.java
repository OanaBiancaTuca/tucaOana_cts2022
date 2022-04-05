package Cerinta4_adapterDeObiecte.clase.STB;

import Cerinta4_adapterDeObiecte.clase.Metrou.ValidatorMetrou;

public class ValidatorAdapter implements  ValidatorStb{
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonamentMetrou();

    }
}
