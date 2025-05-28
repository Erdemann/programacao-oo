package ed03.graficasOnline;

public class GraficoEstatistico implements Imprimivel {
    private String titulo;
    private String tipoGrafico;

    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    @Override
    public void imprimir() {
        String tipo = "Tipo de Gráfico: " + tipoGrafico;
        String tituloFormatado = "Título: " + titulo.toUpperCase();
        System.out.println(tipo);
        System.out.println(tituloFormatado);
    }
}
