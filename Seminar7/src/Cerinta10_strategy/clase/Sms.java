package Cerinta10_strategy.clase;

public class Sms implements  ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println(" Plata a fost efectuata prin sms si are valoarea : "+suma+" lei");
    }
}
