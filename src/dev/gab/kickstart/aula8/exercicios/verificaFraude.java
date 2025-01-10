package dev.gab.kickstart.aula8.exercicios;

import java.util.Scanner;

public class verificaFraude {

    public static void main(String[] args) {

        System.out.println("#  VERIFICAÇÃO CONTRA FRAUDES #\n" +
                "DIGITE 'TRUE' OU 'FALSE' ABAIXO:");
        Scanner sc = new Scanner(System.in);
        boolean verificador = sc.nextBoolean();

        System.out.println("VALOR VERIFICADO: " + verificador);
    }
}
