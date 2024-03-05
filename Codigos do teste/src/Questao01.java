public class Questao01 {
    public static void main(String[] args) throws Exception {
        int i = 13, soma = 0, k = 0;
        while (k < i) {
            k += 1;
            soma += k;
        }
        System.out.printf("O valor da variavel soma eh: %d", soma);
    }
}
