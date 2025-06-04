public class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;
    
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    void incrementarTentativas(){
        this.tentativas++;
    }

    void atualizaPontuacao(int valor){
        this.pontuacao = 100 - tentativas * 10;
    }
}
