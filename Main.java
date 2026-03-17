package biblioteca.app;

import biblioteca.model.*;
import biblioteca.util.ContadorItems;

public class Main {
    public static void main(String[] args) {

        Autor a1 = new Autor("Juan", "Espana");
        Autor a2 = new Autor("Roberto", "Espana");

        Autor[] autoresLibro = {a1, a2};

        Libro libro1 = new Libro(1, "ElLibroDeLaSelva", 1700, 300, autoresLibro);
        Revista revista1 = new Revista(2, "Tech Today", 2023, 10, 5);

        System.out.println(libro1);
        System.out.println(libro1.obtenerDescripcion());

        System.out.println(revista1);
        System.out.println(revista1.obtenerDescripcion());

        System.out.println("Total items: " + ContadorItems.getTotalItems());
        System.out.println("Version de la Biblioteca: " + ContadorItems.getVersion());
    }
}