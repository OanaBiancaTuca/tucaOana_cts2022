package singleton;

public class Singleton {
    private static Singleton instanta=null;

    private Singleton(){};
    //avem grija pt singleton constructorul sa fie privat
    public  static  synchronized  Singleton getInstanta(){
        if(instanta==null) {
            instanta=new Singleton();
        }
        return instanta;
    }

}
