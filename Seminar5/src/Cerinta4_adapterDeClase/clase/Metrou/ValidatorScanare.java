package Cerinta4_adapterDeClase.clase.Metrou;

public class ValidatorScanare implements ValidatorMetrou {
    @Override
    public void valideazaBiletMetrou() {
        System.out.println("bilet de metrou validat");
    }

    @Override
    public void valideazaAbonamentMetrou() {

        System.out.println("abonament de metrou validat");
    }

    @Override
    public void valideazaBilet2calatorii() {
        System.out.println("Cele 2 calatorii au fost validate");
    }
}
