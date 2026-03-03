package nivel_intermediario;

import java.util.Scanner;

public class Exercicio2_Intermediario {
    public static void main(String[] args) {
        /*
            Nível Intermediário - Exercício 2 - Maior e Menor Valor do Array
                Leia vários números e armazene em um array. 
                Crie funções para retornar o maior e o menor valor
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir?");
        int quantidade = entrada.nextInt();

        int[] numeros = new int[quantidade];

        System.out.println("Digite os números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        int maior = encontrarMaiorNumero(numeros);
        int menor = encontrarMenorNumero(numeros);

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        entrada.close();

    }

    // método para percorrer o array e buscar o maior número
    public static int encontrarMaiorNumero(int[] array) {

        int maiorNumero = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maiorNumero) {
                maiorNumero = array[i];
            }
        }

        return maiorNumero;

    }

     // método para percorrer o array e buscar o menor número
     public static int encontrarMenorNumero(int[] array) {

        int menorNumero = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] < menorNumero) {
                menorNumero = array[i];
            }
        }

        return menorNumero;

     }

}
