package Cerinta10_strategy.clase;

public class CardBancar implements  ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println(" Plata a fost efectuata cu cardul bancar si are valoarea : "+suma+" lei");
    }
}
