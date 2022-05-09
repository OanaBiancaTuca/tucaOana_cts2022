package command_16.main;

import command_16.clase.Autobuz;
import command_16.clase.ComandaPlecare;
import command_16.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Autobuz a1=new Autobuz("Mercedes");
        Autobuz a2=new Autobuz("Otokar");

        operator.invoca(new ComandaPlecare(a1,300));
        operator.invoca(new ComandaPlecare(a2,108));
        operator.invoca(new ComandaPlecare(a1,404));
        operator.invoca(new ComandaPlecare(a2,122));
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
