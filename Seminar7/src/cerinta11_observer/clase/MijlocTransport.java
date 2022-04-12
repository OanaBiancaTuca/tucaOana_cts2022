package cerinta11_observer.clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> lista;
    private  int numarLinie;

    public MijlocTransport(int numar) {
        this.lista = new ArrayList<>();
        this.numarLinie = numar;
    }
    public void adaugaCalator(ICalator calator){
        lista.add(calator);
    }
    public void stergeCalator(ICalator calator){
        lista.remove(calator);
    }

    public void trimiteMesaj(String mesaj){
        for(ICalator c: lista){
            c.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("Autobuzul nr "+ numarLinie+ " a plecat din capatul de linie");
    }
}
