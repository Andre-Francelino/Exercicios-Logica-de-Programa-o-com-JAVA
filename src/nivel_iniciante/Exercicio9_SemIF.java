package nivel_iniciante;

public class Exercicio9_SemIF {
    public static void main(String[] args) {
        /*
            9 - Multiplos de 3 (Sem IF)
                Mostre todos os números múltiplos de 3 no intervalo de 1 a 50
        */

       /*   
            A variável i já inicia com o valor de 3 e a cada iteração soma mais 3
            Código computacionalmente mais eficiente sem necessidade de testar condição IF
       */

       for (int i = 3; i <=50; i+=3) {
            System.out.println(i);
       }
    }
}
