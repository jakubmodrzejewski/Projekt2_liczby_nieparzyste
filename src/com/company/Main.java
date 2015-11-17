package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {

        System.out.println("Program, ktory pobiera od uzytkownika liczbe calkowita dodatnia,");
        System.out.println("a nastepnie wyswietla na ekranie kolejno wszystkie liczby niepatrzyste");
        System.out.println("nie wieksze od podanej liczby.");
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj liczbe.");
        int a = wej.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println( i++ );
        }
        System.out.println("Koniec programu.");
    }
}