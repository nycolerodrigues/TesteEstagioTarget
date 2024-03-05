public class Questao03 {
    public static void main(String[] args) {
        // Sequência a)
        /*Nessa sequência cada número é igual ao anterior somado a 2, formando os números ímpares.*/

        int proximoA = 7 + 2;
        System.out.println("O proximo numero da sequencia a eh: " + proximoA);

        // Sequência b)
        /*Nessa sequência cada número é igual ao anterior multiplicado por 2.*/

        int proximoB = 64 * 2;
        System.out.println("O proximo numero da sequencia b eh: " + proximoB);

        // Sequência c)
        /*Nessa sequência cada númerro é igual ao anterior acrescido de um númeor ímpar que segue a sequência 1, 3, 5, 9.*/

        int ultimoC = 36;
        int raizQuadrada = (int) Math.sqrt(ultimoC);
        int proximoC = (raizQuadrada + 1) * (raizQuadrada + 1);
        System.out.println("O proximo numero da sequencia c eh: " + proximoC);

        // Sequência d)
        /*Nessa sequência cada número é igual ao quadrado dos números pares.*/

        int ultimoD = 64;
        int proximoD = (int) Math.pow(Math.sqrt(ultimoD / 4) + 1, 2) * 4;
        System.out.println("O proximo numero da sequencia d eh: " + proximoD);

        // Sequência e)
        /*Nessa sequência cada número é igual a soma do número atual com o número anterior. */
        int penultimoE = 5, ultimoE = 8;
        int proximoE = penultimoE + ultimoE;
        System.out.println("O proximo numero da sequencia e eh: " + proximoE);
        
        //Sequência f)
        /*A sequência da letra f se trata dos números que começam com a letra D, 
        logo não tem como fazer uma lógica para essa sequência,
        estarei apenas mostrando o próximo número.*/

        int proximoF=200;
        System.out.println("O proximo numero da sequencia f eh: "+proximoF);

    }

}