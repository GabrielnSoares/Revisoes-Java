package dev.gab.kickstart.aula10.exercicios;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

        System.out.println("DIGITE UM NÚMERO COM PONTO FLUTUANTE");
        Scanner sc = new Scanner(System.in);
        String recebeTexto = sc.nextLine();

        double converteDouble = Double.parseDouble(recebeTexto);
        System.out.println("CONVERTENDO PARA DOUBLE: " + converteDouble);

        float converteFloat = Float.parseFloat(recebeTexto);
        System.out.println("CONVERTENDO PARA FLOAT: " + converteFloat);

        System.out.println("DIGITE UM NÚMERO INTEIRO: ");
        sc = new Scanner(System.in);
        recebeTexto = sc.nextLine();

        byte converteByte = Byte.parseByte(recebeTexto);
        System.out.println("CONVERTENDO PARA BYTE: " + converteByte);

        short converteShort = Short.parseShort(recebeTexto);
        System.out.println("CONVERTENDO PARA SHORT: " + converteShort);

        int converteInt = Integer.parseInt(recebeTexto);
        System.out.println("CONVERTENDO PARA INT: " + converteInt);

        long converteLong = Long.parseLong(recebeTexto);
        System.out.println("ONVETENDO PARA LONG: " + converteLong );

    }
}
