package nivel_iniciante;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
            2 - Maior entre dois números 
                Leia dois números e mostre qual deles é o maior. Se forem iguais, informe que são iguais.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if(numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if(numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo!");
        } else {
            System.out.println("O segundo número é maior que o primeiro!");
        }

        sc.close();

    }
}
