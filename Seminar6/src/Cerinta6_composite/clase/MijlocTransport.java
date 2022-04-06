package Cerinta6_composite.clase;

import jdk.jshell.spi.ExecutionControl;

public interface MijlocTransport {
    public void afiseazaDescriere();
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException;
    public void stergeMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException;
    public MijlocTransport getMijlocTransport(int index) throws ExecutionControl.NotImplementedException;

}
