import java.util.Random;

public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1;
    }

    public String jogar(int tentativa) {
        // Incrementa as tentativas do jogador
        jogador.incrementarTentativas();
    
        // Verifica se a tentativa está correta, maior ou menor
        if (tentativa == numeroSecreto) {
            jogador.atualizaPontuacao(100); // Atualiza a pontuação ao acertar
            return "Acertou!";
        } else if (tentativa < numeroSecreto) {
            return "O número é maior.";
        } else {
            return "O número é menor.";
        }
    }
}
