package ro.mirodone;


public class Main {

    public static void main(String[] args) {

        Isogram isogram = new Isogram();

        CleverIsogram cleverIsogram = new CleverIsogram();

        System.out.println(isogram.isIsogram("isIsogram"));
        System.out.println(isogram.isIsogram("abc"));
        System.out.println(isogram.isIsogram("Alphabet"));

        System.out.println(cleverIsogram.isIsogram("isIsogram"));
        System.out.println(cleverIsogram.isIsogram("abc"));
        System.out.println(cleverIsogram.isIsogram("Alphabet"));



    }
}
