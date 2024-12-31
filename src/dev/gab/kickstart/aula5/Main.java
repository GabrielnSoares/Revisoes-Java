package dev.gab.kickstart.aula5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Perguntar pro Usuario qual numero ele quer digitar
        System.out.println("Usuario, digite um número: ");

        // 2. Ler o número que o usuário digitou
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = sc.nextInt();

        // 3. Multiplicar o valor digitado por 10
        int resultado = numeroDigitado * 10;

        // 4. Imprimir no terminal  o resultado
        System.out.println("Seu rsultado é: " + resultado);
    }

}
