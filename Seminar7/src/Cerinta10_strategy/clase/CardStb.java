package Cerinta10_strategy.clase;

public class CardStb implements  ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println(" Plata a fost efectuata cu cardul stb si are valoarea : "+suma+" lei");
    }
}
