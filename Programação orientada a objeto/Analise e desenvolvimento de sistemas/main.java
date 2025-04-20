import java.util.Scanner;
/**
  * Classe principal que executa o jogo de adivinhação.
  * Gerencia a interação com o usuário e o fluxo do jogo.
  */
public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Placar placar = new Placar();
         System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
         System.out.print("Digite seu nome: ");
         String nomeJogador = scanner.nextLine();
         Jogador jogador = new Jogador(nomeJogador);
         Jogo jogo = new Jogo(jogador);
         System.out.println("\nTente adivinhar o número secreto entre 1 e 100!");
         while (true) {
             System.out.print("\nDigite sua tentativa: ");
             int tentativa = scanner.nextInt();
             String resultado = jogo.jogar(tentativa);
             if (resultado.equals("acertou")) {
                 System.out.println("\nParabéns! Você acertou!");
                 System.out.printf("Número de tentativas: %d\n", jogador.getTentativas());
                 System.out.printf("Pontuação final: %d pontos\n", jogador.getPontuacao());
                 break;
             } else if (resultado.equals("maior")) {
                 System.out.println("O número secreto é MAIOR que " + tentativa);
             } else {
                 System.out.println("O número secreto é MENOR que " + tentativa);
             }
         }
         placar.adicionarJogador(jogador);
         placar.mostrarRanking();
         scanner.close();
     }
}
