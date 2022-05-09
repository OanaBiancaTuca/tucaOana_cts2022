package state_15.main;


import state_15.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(300);
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeCapatLinie();
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.pleacaInCursa();
    }
}
