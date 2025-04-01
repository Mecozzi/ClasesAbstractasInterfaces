package ejercicioDos;

public class LibroPDF implements SeImprime {
    private String autor;
    private String titulo;
    private String genero;
    private int cantidadPaginas;

    public LibroPDF(String autor, String titulo, String genero, int cantidadPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.cantidadPaginas = cantidadPaginas;
    }

    public void imprimir() {
        System.out.println("Libro en PDF:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Cantidad de páginas: " + cantidadPaginas);
    }
}