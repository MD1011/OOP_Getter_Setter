package UebungenParallel;

public class Figur {

    private static int Lebenspunkkte = 100;
    private static String Name = "Superman";

    public Figur(){

    }

    public Figur(int Lebenspunkkte, String Name){
        this.Lebenspunkkte = Lebenspunkkte;
        this.Name = Name;
    }

    public static int getLeben(){
        return Lebenspunkkte;
    }

    public static String getName(){
        return Name;
    }

    public int setLebenspunkkte(int Lebenspunkkte){
        return Lebenspunkkte;
    }

    public String setName(String Name){
        return Name;
    }


}
