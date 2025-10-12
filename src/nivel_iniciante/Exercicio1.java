package nivel_iniciante;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /*
            1 - Verificação de número par ou ímpar 
                Leia um número inteiro e informe se ele é par ou ímpar.
        */ 
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Você digitou " + numero + ", que é um número Par!");
        } else {
            System.out.println("Você digitou " + numero + ", que é um número Impar!");
        }

        entrada.close();
        
    }
}
