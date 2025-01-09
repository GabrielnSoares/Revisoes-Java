package dev.gab.kickstart.aula5.exercicios;

import java.util.Scanner;

public class sistemaLiberacoes {

    public static void main(String[] args) {

        System.out.println("SISTEMA DE LIBERAÇÕES\n" +
                "DIGITE OO NOME DO FUNCIONÁRIO: ");
        Scanner sc = new Scanner(System.in);
        String nomeFuncionario = sc.nextLine();
        System.out.println(nomeFuncionario);
        System.out.println("GERANDO DECLARAÇÃO...");
        System.out.println("#############################\n" +
                nomeFuncionario + "\nESTÁ LIBERADO  PARA JOGAR PING-PONG\n" +
                "#############################");
    }
}
