package Cerinta10_strategy.main;

import Cerinta10_strategy.clase.CardBancar;
import Cerinta10_strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator=new Validator(10);
        validator.valideazaCalatorie();
        validator.setModPlata(new CardBancar());
        validator.valideazaCalatorie();
    }

}
