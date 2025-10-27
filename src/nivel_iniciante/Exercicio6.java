package nivel_iniciante;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
            6 - Soma de números pares
                Leia um número inteiro positivo calcule a soma de todos os números pares de 1 até esse número
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        int somaDePares = 0;

        if(numero < 0) {
            System.out.println("Número inválido, digite um número positivo!");
        } else {
            for (int i = 1; i <= numero; i++) {
                if(i % 2 == 0) {
                    somaDePares += i;
                }
            }

            System.out.println("A soma de todos os números pares de 1 até " + numero + " é: " + somaDePares);
        }

        entrada.close();
    }
}
