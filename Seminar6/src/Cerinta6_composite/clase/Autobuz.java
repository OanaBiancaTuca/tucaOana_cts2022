package Cerinta6_composite.clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements  MijlocTransport{
    private String model;
    private String producator;
    private int nrLocuri;

    @Override
    public void afiseazaDescriere() {
        System.out.println(toString());
    }

    public Autobuz(String model, String producator, int nrLocuri) {
        this.model = model;
        this.producator = producator;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", producator='" + producator + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException {

        throw  new ExecutionControl.NotImplementedException("Not implemented");
    }

    @Override
    public void stergeMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException {

        throw  new ExecutionControl.NotImplementedException("Not implemented");
}

    @Override
    public MijlocTransport getMijlocTransport(int index) throws ExecutionControl.NotImplementedException {
        throw  new ExecutionControl.NotImplementedException("Not implemented");
    }
}
