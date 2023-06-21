import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int maxTries = 5;
        int randomNumber;
        int tries;
        boolean tryAgain;

        System.out.println("=========================================");
        System.out.println("       Bem-vindo ao Jogo de Adivinhação    ");
        System.out.println("             Número Secreto               ");
        System.out.println("=========================================");
        System.out.println();

        do {
            randomNumber = random.nextInt(101);
            tries = 0;
            tryAgain = false;

            System.out.println("Tente adivinhar um numero de 0 a 100 em ate 5 tentativas!!");
            System.out.println();

            while (tries < maxTries) {
                System.out.printf("Tentativas %d: Digite um numero: ", (tries + 1));
                int guess = read.nextInt();
                tries++;

                if (guess == randomNumber) {
                    System.out.println("Parabens você acertou!!");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("O numero digitado é menor que o numero a ser adivinhado...");
                } else {
                    System.out.println("O numero digitado e maior que o numero a ser adivinhado...");
                }
            }

            if (tries == maxTries) {
                System.out.println("================================================");
                System.out.println("Número máximo de tentativas alcançado!");
                System.out.println("O número era: " + randomNumber);
                System.out.println("================================================");
            }

            System.out.println("Deseja jogar novamente? (Digite 's' para sim e 'n' para não");
            String resposta = read.next();

            if (resposta.equalsIgnoreCase("s")) {
                tryAgain = true;
                System.out.println();
            }
        }while (tryAgain);

        System.out.println("Obrigado por jogar!!!");
    }
}