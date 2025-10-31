package nivel_iniciante;

import java.util.Scanner;

public class Exercicio7_Do_While {
    public static void main(String[] args) {

        /*
            7 - Média de 3 notas (com validação)
                Leia 3 notas de um aluno, calcule a média e informe:
                - APROVADO: média >= 7
                - RECUPERAÇÃO: 5 <= média < 7
                - REPROVADO: média < 5
                As notas devem ser entre 0 e 10.
        */

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3;

        // ---- Entrada e validação da 1ª nota ----
        do {
            System.out.print("Insira o valor da 1ª nota (0 a 10): ");
            nota1 = sc.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota1 < 0 || nota1 > 10);

        // ---- Entrada e validação da 2ª nota ----
        do {
            System.out.print("Insira o valor da 2ª nota (0 a 10): ");
            nota2 = sc.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota2 < 0 || nota2 > 10);

        // ---- Entrada e validação da 3ª nota ----
        do {
            System.out.print("Insira o valor da 3ª nota (0 a 10): ");
            nota3 = sc.nextDouble();
            if (nota3 < 0 || nota3 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota3 < 0 || nota3 > 10);

        // ---- Cálculo da média ----
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%nMédia final: %.2f%n", media);

        // ---- Estrutura condicional ----
        if (media >= 7) {
            System.out.println("Aluno foi APROVADO!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em RECUPERAÇÃO!");
        } else {
            System.out.println("Aluno foi REPROVADO!");
        }

        sc.close();
    }
}
