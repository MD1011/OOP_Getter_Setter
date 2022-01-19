package UebungenParal;

public class Brot {

    private String name = "Tafellander";
    private double preis = 3.89;
    int rabatt = 1;

    public Brot(){

    }

    public Brot (String name, double preis){
        this.name = name;
        this.preis = preis;
    }

    public String getName(){
        return name;
    }

    public double getPreis(){
        return preis;
    }

    public void setPreis(int rabatt) {
        this.preis -= rabatt;
        System.out.println(this.preis + " - Neuer Preis nach Rabattabzug");
    }

}
