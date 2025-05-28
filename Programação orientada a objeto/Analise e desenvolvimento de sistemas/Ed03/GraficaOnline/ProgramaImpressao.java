package ed03.graficasOnline;

public class ProgramaImpressao {
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto("Relatório Anual", "Este é o conteúdo do relatório anual da empresa...");
        ImagemDigital img = new ImagemDigital("foto.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Vendas por Região", "pizza");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 42);

        String[] titulos = {
            "=== DOCUMENTO DE TEXTO ===",
            "=== IMAGEM DIGITAL ===",
            "=== GRÁFICO ESTATÍSTICO ===",
            "=== RELATÓRIO PDF ==="
        };

        Imprimivel[] itens = { doc, img, grafico, relatorio };

        for (int i = 0; i < itens.length; i++) {
            System.out.println(titulos[i]);
            itens[i].imprimir();
            System.out.println();
        }
    }
}
