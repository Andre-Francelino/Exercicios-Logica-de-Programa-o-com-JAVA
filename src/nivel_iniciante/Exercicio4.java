package nivel_iniciante;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
            4 - Tabuada
                Leia um número inteiro e mostre a tabuada dele de 1 a 10
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int numero = sc.nextInt();

        System.out.println("\nVocê digitou o número " + numero + ", e sua tabuada referente é: ");
        System.out.println(numero + " x 1 = " + numero * 1);
        System.out.println(numero + " x 2 = " + numero * 2);
        System.out.println(numero + " x 3 = " + numero * 3);
        System.out.println(numero + " x 4 = " + numero * 4);
        System.out.println(numero + " x 5 = " + numero * 5);
        System.out.println(numero + " x 6 = " + numero * 6);
        System.out.println(numero + " x 7 = " + numero * 7);
        System.out.println(numero + " x 8 = " + numero * 8);
        System.out.println(numero + " x 9 = " + numero * 9);
        System.out.println(numero + " x 10 = " + numero * 10);

        sc.close();

    }
}
