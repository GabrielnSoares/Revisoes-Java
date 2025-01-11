package dev.gab.kickstart.aula11.exercicios;

import java.util.Scanner;

public class operadoresAritmeticosv2 {

    public static void main(String[] args) {

        System.out.println("""
                SISTEMA DE ARQUITETURA 2.0
                QUANTO DE REVESTIMENTO PRECISAMOS
                DIGITE O DIAMETRO EM METROS:\s""");
        Scanner sc = new Scanner(System.in);
        double diametro = sc.nextDouble();

        double resultado;
        resultado = Math.PI * Math.pow((diametro / 2), 2);
        System.out.println("""
                CALCULANDO RESULTADO
                RESULTADO APROXIMADO:\s""" + resultado + " M2");

    }
}
