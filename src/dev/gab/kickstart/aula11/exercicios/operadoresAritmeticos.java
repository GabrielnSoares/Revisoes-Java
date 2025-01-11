package dev.gab.kickstart.aula11.exercicios;


import java.util.Scanner;

public class operadoresAritmeticos {

    public static void main(String[] args) {

        System.out.println("""
                SISTEMA DE ARQUITETURA
                VAMOS CALCULAR O METRO QUADRADO?
                DIGITE A LARGURA EM METROS:\s""");
        Scanner sc = new Scanner(System.in);
        float largura = sc.nextFloat();

        System.out.println("DIGITE A ALTURA EM METROS: ");
        sc = new Scanner(System.in);
        float altura = sc.nextFloat();

        System.out.println("CALCULADO O METRO QUADRADO...");
        float m2 = largura * altura;

        System.out.println("RESULTADO: " + m2 + " M2");
    }
}
