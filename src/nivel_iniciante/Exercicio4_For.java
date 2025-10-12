package nivel_iniciante;

import java.util.Scanner;

public class Exercicio4_For {
    public static void main(String[] args) {

        /*
            4 - Tabuada usando laço FOR
                Leia um número inteiro e mostre a tabuada dele de 1 a 10
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("\nTabuada do número " + numero + ", usando laço FOR:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }

        sc.close();
    }
}
