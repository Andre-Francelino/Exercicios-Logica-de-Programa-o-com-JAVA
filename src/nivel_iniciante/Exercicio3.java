package nivel_iniciante;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*
            3 - Classificação de idade 
                Leia a idade de uma pessoa e informe se ela é CRIANÇA (0 a 12 anos),
                ADOLESCENTE (13 a 17 anos), ADULTO (18 a 59 anos) ou IDOSO (60 anos ou mais)
        */ 

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if(idade < 0) {
            System.out.println("Idade inválida! Digite um número positivo.");
        } else if(idade <= 12) {
            System.out.println("Você tem " + idade + " anos, você ainda é uma CRIANÇA.");
        } else if(idade <= 17) {
            System.out.println("Você tem " + idade + " anos, já é um ADOLESCENTE.");
        } else if(idade <= 59) {
            System.out.println("Você tem " + idade + " anos, já é um ADULTO.");
        } else {
            System.out.println("Você tem " + idade + " anos, você é um IDOSO!");
        }

        entrada.close();

    }
}
