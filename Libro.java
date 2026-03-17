package biblioteca.model;

public class Libro extends ItemBiblioteca {
    private Autor[] autores;
    private int numeroPaginas;

    public Libro(int id, String titulo, int anio, int numeroPaginas, Autor[] autores) {
        super(id, titulo, anio);
        this.numeroPaginas = numeroPaginas;
        this.autores = autores;
    }

    @Override
    public String obtenerDescripcion() {
        String nombres = "";
        for (Autor a : autores) {
            nombres += a.getNombre() + " ";
        }
        return "Libro de " + nombres + " con " + numeroPaginas + " paginas.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Paginas: " + numeroPaginas;
    }
}