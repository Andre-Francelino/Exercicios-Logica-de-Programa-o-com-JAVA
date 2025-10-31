package nivel_iniciante;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        /*
            7 - Média de 3 notas
                Leia 3 notas de um aluno, calcule a média e informe se ele está APROVADO (média maior ou igual a 7), 
                em RECUPERAÇÃO (média maior ou igual a 5 e menor que 7), ou REPROVADO (média menor que 5)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira o valor da 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Insira o valor da 3ª nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno foi APROVADO");
        } else if(media >= 5 && media < 7) {
            System.out.println("Aluno em RECUPERAÇÃO");
        } else {
            System.out.println("Aluno foi REPROVADO");
        }

        sc.close();

    }
    
}
