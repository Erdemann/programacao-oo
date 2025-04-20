/**
  * Classe que representa um jogador do jogo de adivinhação.
  * Armazena informações como nome, número de tentativas e pontuação.
  */
public class Jogador {
     /** Nome do jogador */
     private String nome;
     /** Número de tentativas realizadas */
     private int tentativas;
     /** Pontuação atual do jogador */
     private int pontuacao;
     /**
      * Construtor da classe Jogador.
      * @param nome Nome do jogador
      */
     public Jogador(String nome) {
         this.nome = nome;
         this.tentativas = 0;
         this.pontuacao = 0;
     }
     /**
      * Retorna o nome do jogador.
      * @return Nome do jogador
      */
     public String getNome() {
         return nome;
     }
     /**
      * Define o nome do jogador.
      * @param nome Novo nome do jogador
      */
     public void setNome(String nome) {
         this.nome = nome;
     }
     /**
      * Retorna o número de tentativas.
      * @return Número de tentativas
      */
     public int getTentativas() {
         return tentativas;
     }
     /**
      * Define o número de tentativas.
      * @param tentativas Novo número de tentativas
      */
     public void setTentativas(int tentativas) {
         this.tentativas = tentativas;
     }
     /**
      * Retorna a pontuação atual.
      * @return Pontuação atual
      */
     public int getPontuacao() {
         return pontuacao;
     }
     /**
      * Define a pontuação atual.
      * @param pontuacao Nova pontuação
      */
     public void setPontuacao(int pontuacao) {
         this.pontuacao = pontuacao;
     }
     /**
      * Incrementa o número de tentativas em 1.
      */
     public void incrementarTentativas() {
         this.tentativas++;
     }
     /**
      * Adiciona pontos à pontuação atual do jogador.
      * @param valor Pontos a serem adicionados
      */
     public void atualizarPontuacao(int valor) {
         this.pontuacao += valor;
     }
}
