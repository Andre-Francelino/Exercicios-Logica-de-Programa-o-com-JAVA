package nivel_intermediario;

import java.util.Scanner;

public class Exercicio1_Intermediario {
    public static void main(String[] args) {
        /*
            Nível Intermediário - Exercício 1 - Média de valores em um Array
                Leia 10 números e armazene em um array.
                Crie uma função que calcule e retorne a média dos valores.
         */

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        System.err.println("Digite os 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        double media = calcularMedia(numeros);

        System.out.println("A média dos valores é: " + media);

        sc.close();
    }

    public static double calcularMedia(double[] array) {
        double soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma / array.length;
    }


}
