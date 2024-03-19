package EsercizioBiblioteca;

public class Libro {

    //dichiaro le variabili
    String titolo;
    int copieDisponibili;
    int copieInPrestito;

    //costruttore Libro
    public Libro(String titolo, int copieDisponibili, int copieInPrestito) {

        this.titolo = titolo;
        this.copieDisponibili = copieDisponibili;
        this.copieInPrestito = copieInPrestito;
    }

    //Metodi getter e setter per titolo, copieDisponibili e copieInPrestito
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getCopieDisponibili() {
        return copieDisponibili;
    }

    public void setCopieDisponibili(int copieDisponibili) {
        this.copieDisponibili = copieDisponibili;
    }

    public int getCopieInPrestito() {
        return copieInPrestito;
    }

    public void setCopieInPrestito(int copieInPrestito) {
        this.copieInPrestito = copieInPrestito;
    }
}
