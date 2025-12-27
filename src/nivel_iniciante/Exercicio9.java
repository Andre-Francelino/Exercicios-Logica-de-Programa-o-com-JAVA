package nivel_iniciante;

public class Exercicio9 {
    public static void main(String[] args) {
        /*
            9 - Multiplos de 3
                Mostre todos os números múltiplos de 3 no intervalo de 1 a 50
        */

       System.out.println("Números múltiplos de 3 de 1 até 50:");

       for (int i = 1; i <= 50; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
       }
       
    }
}
