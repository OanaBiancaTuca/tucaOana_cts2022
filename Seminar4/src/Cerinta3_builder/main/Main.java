package Cerinta3_builder.main;

import Cerinta3_builder.clase.Autobuz;
import Cerinta3_builder.clase.AutobuzBuilder;

public class Main {
    public static void main(String [] args){
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setNumarLocuri(100);
        autobuzBuilder.setNrInmatriculare("b-altnumar");
        autobuzBuilder.setOprireCapatLinie(Boolean.FALSE);


        //declaram 2 autobuze

        Autobuz autobuz=new AutobuzBuilder().setOpenDoors(Boolean.FALSE).build();
        Autobuz autobuz2=autobuzBuilder.build();

        System.out.println(autobuz);
        System.out.println(autobuz2);
    }
}
