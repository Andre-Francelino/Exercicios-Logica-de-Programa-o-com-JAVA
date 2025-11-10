package nivel_iniciante;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        /*
            8 - Contagem de números
                Leia 10 números e mostre quantos deles são POSITIVOS, NEGATIVOS e IGUAIS A ZERO
        */

        int iguaisAZero = 0;
        int positivos = 0;
        int negativos = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
          int numero = entrada.nextInt();

          if(numero == 0) {
            iguaisAZero ++;
          } else if(numero > 0) {
            positivos++;
          } else {
            negativos++;
          }
        }

        System.out.println("\n--- Resultado da Contagem ---");
        System.out.println("A quantidade de números iguais a zero é: " + iguaisAZero);
        System.out.println("A quantidade de números positivos é: " + positivos);
        System.out.println("A quantidade de números negativos é: " + negativos);

        entrada.close();

    }
    
}
