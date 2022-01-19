package UebungenParallel2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Katze {

    private String name;
    private int alter;
    private int gewicht;


    public Katze(String name, int alter, int gewicht) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
    }


    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Bitte den Namen eingeben: ");
        Scanner scan = new Scanner(System.in);
        String nam = scan.nextLine();
        for (char character : nam.toCharArray()) {
            if (Character.isDigit(character)) {
                System.out.println("Name darf keine Zahlen beinhalten");
                setName();
                return;
            }
        }
        if (nam.equals("")) {
            System.err.println("Der Name muss mindestens ein Zeichen lang sein");
            setName();
        } else {
            this.name = nam;
            System.out.println(this.name);
        }
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter() {
        System.out.println("Bitte das alter eingeben:");
        Scanner scan = new Scanner(System.in);
        int alt = scan.nextInt();
        if (alt > 0 && alt < 50) {
            this.alter = alt;
            System.out.println(this.alter);
        } else {
            System.out.println("Error");
            setAlter();
        }
    }

    public int getGewicht() {
        return gewicht;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "alter: " + alter + "\n" +
                "gewicht: " + gewicht;

    }

    public void setGewicht() {
        System.out.println("Bitte das gewicht eingeben:");
        Scanner scan = new Scanner(System.in);
        int gewicht = -1;
        try {
            gewicht = scan.nextInt();
        } catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Nur Zahl eingeben");
            setGewicht();
            return;
        }
        if (gewicht > 0 && gewicht < 50) {
            this.gewicht = gewicht;
            System.out.println(this.gewicht);
        } else {
            System.err.println("Error");
            setGewicht();
        }
    }
}
