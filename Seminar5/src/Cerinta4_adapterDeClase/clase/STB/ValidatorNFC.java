package Cerinta4_adapterDeClase.clase.STB;

public class ValidatorNFC implements ValidatorStb {
    @Override
    public void valideazaBilet() {
        System.out.println("Bilet STB validat");
    }

    @Override
    public void valideazaAbonament() {

        System.out.println("Abonament STB validat");
    }
}
