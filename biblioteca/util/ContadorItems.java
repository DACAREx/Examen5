package biblioteca.util;

public class ContadorItems {
    private static int contador = 0;

    public static void incrementar() {
        contador++;
    }

    public static int getTotalItems() {
        if (contador < ConfiguracionSistema.MAX_ITEMS){
            return contador;
            }
        return ConfiguracionSistema.MAX_ITEMS;
       }
    public static int getVersion() {
        return ConfiguracionSistema.VERSION;
       }
 }
