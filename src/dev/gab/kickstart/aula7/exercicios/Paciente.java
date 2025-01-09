package dev.gab.kickstart.aula7.exercicios;

import java.util.Scanner;

public class Paciente {

    public static void main(String[] args) {

        System.out.println("SISTEMA DE PESAGEM DE PACIENTES\n" +
                "DIGITE O PESO EM JANEIRO: ");
        Scanner sc = new Scanner(System.in);
        float pesoJaneiro = sc.nextFloat();

        System.out.println("DIGITE O PESO EM FEVEREIRO");
        float pesoFevereiro = sc.nextFloat();

        System.out.println("DIGITE O PESO EM MARÇO");
        float pesoMarco = sc.nextFloat();

        System.out.println("DIGITE O PESO EM ABRIL");
        float pesoAbril = sc.nextFloat();

        System.out.println("DIGITE O PESO EM MAIO");
        float pesoMaio = sc.nextFloat();

        System.out.println("DIGITE O PESO EM JUNHO");
        float pesoJunho = sc.nextFloat();

        System.out.println("DIGITE O PESO EM JULHO");
        float pesoJulho = sc.nextFloat();

        System.out.println("DIGITE O PESO EM AGOSTO");
        float pesoAgosto = sc.nextFloat();

        System.out.println("DIGITE O PESO EM SETEMBRO");
        float pesoSetembro = sc.nextFloat();

        System.out.println("DIGITE O PESO EM OUTUBRO");
        float pesoOutubro = sc.nextFloat();

        System.out.println("DIGITE O PESO EM NOVEMBRO");
        float pesoNovembro = sc.nextFloat();

        System.out.println("DIGITE O PESO EM DEZEMBRO");
        float pesoDezembro = sc.nextFloat();

        double pesoMedio = (pesoJaneiro + pesoFevereiro + pesoMarco + pesoAbril + pesoMaio + pesoJunho +
                pesoJulho + pesoAgosto + pesoSetembro + pesoOutubro + pesoNovembro + pesoDezembro) / 12;

        System.out.print("PESO MÉDIO: " + pesoMedio + " KG");
    }
}
