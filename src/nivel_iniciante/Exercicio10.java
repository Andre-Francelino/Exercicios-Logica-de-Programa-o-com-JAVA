package nivel_iniciante;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
            10 - Número primo
            Leia um número inteiro e verifique se ele é um NÚMERO PRIMO (divisível apenas por 1 ou por ele mesmo)
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        boolean ehPrimo = true;

        if(numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if(numero % 1 == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if(ehPrimo) {
            System.err.println("O número " + numero + " É um número primo!");
        } else {
            System.out.println("O número " + numero + " NÂO é um número primo!");
        }

        entrada.close();
    }
}
