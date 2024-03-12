package EsercizioPiattoSpeciale;


public class PiattoSpeciale {

    //dichiarazione variabili private e pubbliche
    private final int prezzoFisso = 1;
    private int prezzoTotale;
    private String ingredienteFisso;
    public String ingredienteAScelta;
    
    //
    public PiattoSpeciale(String ingredienteFisso) {
        this.ingredienteFisso = ingredienteFisso;
        this.prezzoTotale = prezzoFisso;
    }

    //
    public void addIngredienteAScelta(String ingredienteAScelta, double prezzo) {
        this.ingredienteAScelta = ingredienteAScelta;
        this.prezzoTotale += prezzo;
    }

    //
    public void calcolaPrezzoTotale(double prezzoIngredienteFisso) {
        this.prezzoTotale += prezzoIngredienteFisso;
    }

    //
    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    //
    public String getIngredienteAScelta() {
        return ingredienteAScelta;
    }

    //
    public String getIngredienteFisso() {
        return ingredienteFisso;
    }
}