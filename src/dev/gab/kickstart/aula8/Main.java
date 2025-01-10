package dev.gab.kickstart.aula8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // boolean - true or false
        boolean  meuBooleano;

        System.out.println("É falso ou verdadeiro? ");
        Scanner sc = new Scanner(System.in);
        meuBooleano = sc.nextBoolean();

        if (meuBooleano) {
            System.out.println("É verdadeiro");
        } else {
            System.out.println("É falso");
        }

        System.out.println(meuBooleano);
    }
}
