package UebungenParal;

import java.util.Scanner;

public class Mein {

    public static void main(String[] args) {

        Brot broteins = new Brot();
        broteins.getName();
        broteins.getPreis();

        Scanner x = new Scanner(System.in);
        String eingabe = x.next();

        if (eingabe.equals("Tafellander")){
            System.out.println("Vorherriger Preis - " + broteins.getPreis());
            broteins.setPreis(broteins.rabatt);
            System.out.println(broteins.getName());
        }


    }


}
