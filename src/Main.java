public class Main {
    public static void main(String[] args) {

    }

    public abstract class Animal {
        private boolean zbudowanyZKomorek = true;
        private int iloscOczu;
    }

    public abstract class Fish extends Animal {
        private int iloscPletw;
        private boolean czyPlywaWWodzieSlodkiej;
    }

    public abstract class Mammal extends Animal {
        private double temperaturaCiala;
    }

    public class GoldFish extends Fish {
        private int ileSpelniZyczen = 3;

    }
public class Human extends Mammal{
        private int wIluJezykachUmieProgramowac;

}
}