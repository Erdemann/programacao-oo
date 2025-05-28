package ed03.graficasOnline;

public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimir() {
        String infoAutor = "Autor: " + autor;
        String infoPaginas = "Número de páginas: " + numeroPaginas;
        System.out.println(infoAutor);
        System.out.println(infoPaginas);
    }
}
