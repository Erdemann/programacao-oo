import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        Jogador jogador = new Jogador(nomeJogador);

        Jogo jogo = new Jogo(jogador);

        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");

        boolean acertou = false;
        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();

            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.equals("Acertou!")) {
                acertou = true;
            }
        }
        System.out.println("Parabéns, " + jogador.getNome() + "!");
        System.out.println("Você acertou em " + jogador.getTentativas() + " tentativas.");
        System.out.println("Sua pontuação final é: " + jogador.getPontuacao());

        placar.adicionarJogador(jogador);
        System.out.println("Ranking atualizado:");
        placar.mostrarRanking();

        scanner.close();
    }
}
