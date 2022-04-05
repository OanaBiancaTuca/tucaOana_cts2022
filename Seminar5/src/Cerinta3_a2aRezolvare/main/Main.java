package Cerinta3_a2aRezolvare.main;

import Cerinta3_a2aRezolvare.clase.Autobuz;
import Cerinta3_a2aRezolvare.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Dorel").setOpenDoors(Boolean.TRUE);
        Autobuz autobuz= autobuzBuilder.build();
        System.out.println(autobuz);
    }
}
