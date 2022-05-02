package Cerinta14_template.clase;

public abstract class MijlocTransportPeSine {
    protected abstract void oprireStatia1();
    protected abstract void oprireStatia2();
    protected abstract void oprireStatia3();

    public final void parcurgeTraseu(){
        oprireStatia1();
        oprireStatia2();
        oprireStatia3();
    }
    public final void parcurgeTraseuInvers(){
        oprireStatia3();
        oprireStatia2();
        oprireStatia1();
    }

}
