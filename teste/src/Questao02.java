import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("SEQUENCIA DE FIBONACCI");
        System.out.print("Informe um numero: ");
        numero = sc.nextInt();
        if (sequenciaFibonacci(numero)) {
            System.out.printf("O numero %d pertence a sequencia de Fibonacci.", numero);
        } else {
            System.out.printf("O %d numero nao pertece a sequencia de Fibonacci.", numero);
        }
        sc.close();
    }

    // Função para saber se o número pertence a sequencia de fibonacci.

    public static boolean sequenciaFibonacci(int numero) {
        int fibo1 = 0, fibo2 = 1;
        while (fibo2 < numero) {
            int fibo3 = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;
        }
        return fibo2 == numero;
    }
}
