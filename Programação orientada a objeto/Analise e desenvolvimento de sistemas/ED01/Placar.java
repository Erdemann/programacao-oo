import java.util.ArrayList;

public class Placar {
    private ArrayList<Jogador> ranking;

    public Placar() {
    }

    void adicionarJogador(Jogador j){
        ranking.add(j);
    }

    void mostrarRanking(){
        for (int i = 0; i < ranking.size(); i++) {
            Jogador jogador = ranking.get(i);
            System.out.println("Nome: " + jogador.getNome() + ", Pontuação: " + jogador.getPontuacao());
        }
    }

    
