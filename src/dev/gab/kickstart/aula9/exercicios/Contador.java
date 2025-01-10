package dev.gab.kickstart.aula9.exercicios;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        System.out.println("# BEM VINDO AO CONTADOR DE CARACTERES #\n" +
                "DIGITE UM PROMPT");
        Scanner sc = new Scanner(System.in);
        String contador = sc.nextLine();

        int quantidadeCaracter = contador.length();

        System.out.println("QUANTIDADE DE CARACTERES: " + quantidadeCaracter);
    }
}
