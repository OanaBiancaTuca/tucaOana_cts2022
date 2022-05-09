package command_16.clase;

public class Autobuz {
    private String model;
    public void pleacaInCursa(int nrLinie){
        System.out.println("Autobuzul "+this.model+" a plecate pe linia "+nrLinie);
    }

    public Autobuz(String model) {
        this.model = model;
    }
}
