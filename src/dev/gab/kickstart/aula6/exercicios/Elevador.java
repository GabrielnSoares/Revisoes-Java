package dev.gab.kickstart.aula6.exercicios;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {

        System.out.println("VAMOS ATÉ A LUA HOJE!\n" +
                "DIGITE O PESO DO PRIMEIRO PASSAGEIRO");
        Scanner sc = new Scanner(System.in);
        short peso1 = sc.nextShort();

        System.out.println("DIGITE O PESO DO SEGUNDO PASSAGEIRO");
        short peso2 = sc.nextShort();

        System.out.println("DIGITE O PESO DO TERCEIRO PASSAGEIRO");
        short peso3 = sc.nextShort();

        short somaPesos = (short) (peso1 + peso2 + peso3);

        System.out.println("PESO TOTAL DOS PASSAGEIROS: " + somaPesos + " KG");

        if (somaPesos > 800) {
            System.out.println("REDUZA O PESO DO ELEVADOR");

        } else {
            System.out.println("VIAGEM LIBERADA!");
        }

    }
}
