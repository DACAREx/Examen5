package biblioteca.model;

public class Revista extends ItemBiblioteca {
    public int periodicidad;
    private int numero;

    public Revista(int id, String titulo, int anio, int periodicidad, int numero) {
        super(id, titulo, anio);
        this.periodicidad = periodicidad; //Hace referencia a cada cuantas semanas sale una
        this.numero = numero;
    }

    @Override
    public String obtenerDescripcion() {                 
        return "Revista numero " + numero + " de periocidad " + periodicidad;
    }
}
