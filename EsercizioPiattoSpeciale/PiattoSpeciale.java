package EsercizioPiattoSpeciale;

import java.util.ArrayList;

public class PiattoSpeciale {

    //dichiarazione variabili private e pubbliche
    private final int prezzoFisso = 1;
    private int prezzoTotale;
    private String ingredienteFisso;
    public String ingredienteAScelta;

    ArrayList<String> ListaIngredientiAScelta = new ArrayList<String>();
    ArrayList<Integer> ListaPrezziAScelta = new ArrayList<Integer>();
    
    //
    public PiattoSpeciale(String ingredienteFisso) {
        this.ingredienteFisso = ingredienteFisso;
        this.prezzoTotale = prezzoFisso;
    }

    //
    public void addIngredienteAScelta(String ingredienteAScelta, int prezzo) {
        this.ingredienteAScelta = ingredienteAScelta;
        this.prezzoTotale += prezzo;

        this.ListaIngredientiAScelta.add(ingredienteAScelta);
        this.ListaPrezziAScelta.add(prezzo);
    }

    //
    public void calcolaPrezzoTotale(double prezzoIngredienteFisso) {
        this.prezzoTotale += prezzoIngredienteFisso;
    }

    //
    public int getPrezzoTotale() {
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