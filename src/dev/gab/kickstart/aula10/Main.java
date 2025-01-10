package dev.gab.kickstart.aula10;

public class Main {

    public static void main(String[] args) {

        // Widening Casting (automático):
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manual):
        // double -> float -> long -> int -> char -> short -> byte

        long tipoMaior = 10000000;
        byte tipoMenor = (byte) tipoMaior;

        String texto = "50";
        int n2 = Integer.parseInt(texto);
        int n1 = 50;

        int numero = 150;

        String valorConvertido = String.valueOf(numero);

        System.out.println(valorConvertido);

        System.out.println(n2 + n1);

        System.out.println(tipoMenor);
        System.out.println(tipoMaior);

    }
}
