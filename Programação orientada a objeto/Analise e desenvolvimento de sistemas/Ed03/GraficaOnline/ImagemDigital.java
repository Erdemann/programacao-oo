package ed03.graficasOnline;

public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    @Override
    public void imprimir() {
        String infoArquivo = "Arquivo: " + nomeArquivo;
        String infoResolucao = "Resolução: " + resolucao;
        System.out.println(infoArquivo);
        System.out.println(infoResolucao);
    }
}
