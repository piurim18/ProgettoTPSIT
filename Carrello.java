import java.util.ArrayList;

public class Carrello {
    private static final ArrayList<String> prodotti = new ArrayList<>();
    private static double totale = 0.0;

    public static void aggiungiProdotto(String descrizione, double prezzo) {
        prodotti.add(descrizione + " - €" + String.format("%.2f", prezzo));
        totale += prezzo;
    }

    public static String getContenutoCarrello() {
        StringBuilder sb = new StringBuilder();
        for (String p : prodotti) {
            sb.append(p).append("\n");
        }
        sb.append("\nTotale: €").append(String.format("%.2f", totale));
        return sb.toString();
    }

    
}
