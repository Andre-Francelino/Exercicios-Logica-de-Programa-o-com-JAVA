package nivel_iniciante;

import java.util.Scanner;

public class Exercicio5_For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if(numero < 0) {
            System.out.println("Número inválido, digite um número positivo!");
        } else {
            System.out.println("\nContagem regressiva usando laço FOR:");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
