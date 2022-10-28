package Homework;
import java.util.Scanner;

public class ErroreSemantico {
    public static void main(String[] args) {
        int altezza, profondita, larghezza;
        System.out.println("Digita l'altezza, la larghezza e la profondità");
        System.out.println("di una scatola e io calcolerò il volume");
        Scanner tastiera = new Scanner(System.in);
        altezza = tastiera.nextInt();
        larghezza = tastiera.nextInt();
        profondita = tastiera.nextInt();
        int volume = altezza * larghezza * profondita;
        System.out.println("Il volume è " + volume);
        tastiera.close();
    }
}