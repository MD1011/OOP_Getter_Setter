package UebungenParal2;

import UebungenParal.Figur;

import java.util.Scanner;



public class Main extends Figur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        if (x.equals("Superman")){
            System.out.println(getName());
            System.out.println(getLeben());
        }else{
            System.err.println("Error");
        }



    }



}
