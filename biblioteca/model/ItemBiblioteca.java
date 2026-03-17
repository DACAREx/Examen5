package biblioteca.model;

import biblioteca.util.ContadorItems;

public abstract class ItemBiblioteca {
    private int id;
    private String titulo;
    private int anioPublicacion;

    public ItemBiblioteca(int id, String titulo, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        ContadorItems.incrementar(); // incrementa contador
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public abstract String obtenerDescripcion();

    @Override
    public String toString() {
        return "ID: " + id + ", Titulo: " + titulo + ", Ano: " + anioPublicacion;
    }
}
