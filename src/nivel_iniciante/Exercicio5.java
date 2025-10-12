package nivel_iniciante;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        /*
            5 - Contagem regressiva
                Leia um número inteiro positivo e mostre uma contagem regressiva até o número 0.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = sc.nextInt();

        if(numero < 0) {
            System.out.println("Por favor, insira um número inteiro positivo!");
        } else {
            while(numero >= 0) {
                System.out.println(numero);
                numero --;
            }
        }

        System.out.println("Contagem finalizada!");

        sc.close();
    }
}
