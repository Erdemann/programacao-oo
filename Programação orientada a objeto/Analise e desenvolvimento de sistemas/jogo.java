import java.util.Random;
/**
  * Classe que gerencia a lógica do jogo de adivinhação.
  * Controla o número secreto e as tentativas do jogador.
  */
public class Jogo {
     /** Jogador atual */
     private Jogador jogador;
     /** Número secreto a ser adivinhado */
     private int numeroSecreto;
     /**
      * Construtor da classe Jogo.
      * @param jogador Jogador que irá participar do jogo
      */
     public Jogo(Jogador jogador) {
         this.jogador = jogador;
         Random random = new Random();
         this.numeroSecreto = random.nextInt(100) + 1; // Gera número entre 1 e 100
     }
     /**
      * Processa uma tentativa do jogador.
      * @param tentativa Número que o jogador tentou
      * @return String indicando se o número é maior, menor ou se acertou
      */
     public String jogar(int tentativa) {
         jogador.incrementarTentativas();
         if (tentativa < numeroSecreto) {
             return "maior";
         } else if (tentativa > numeroSecreto) {
             return "menor";
         } else {
             // Calcula a pontuação baseada no número de tentativas
             int pontos = 100 - (jogador.getTentativas() * 5);
             if (pontos < 0) pontos = 0;
             jogador.atualizarPontuacao(pontos);
             return "acertou";
         }
     }
}
