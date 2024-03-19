package EsercizioBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    //creo oggetti lista e scanner
    ArrayList <Libro> listaLibri = new ArrayList <Libro>();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);


    //popolo la lista con degli oggetti Libro
    public Biblioteca(){

        listaLibri.add(new Libro("Il signore degli anelli", 5, 0));
        listaLibri.add(new Libro("1984", 3, 0));
        listaLibri.add(new Libro("La fattoria degli animali", 4, 0));
        listaLibri.add(new Libro("Harry Potter", 10, 0));
        listaLibri.add(new Libro("Dune", 7, 0));
    };

    public ArrayList<Libro> getListaLibri() {
        return listaLibri;
    }

    boolean libroTrovato = false;

    //metodo che permette all'utente di selezionare un libro da prendere in prestito
    public void prestaLibro(String titolo) {

        //ciclo gli oggetti Libro all'interno della lista
        for (Libro libro : listaLibri) {

            //se il titolo cercato corrisponde a uno della lista aggiorno i dati 
            if (libro.getTitolo().equals(titolo)) {

                if (libro.getCopieDisponibili() > 0) {

                    libro.setCopieDisponibili(libro.getCopieDisponibili() - 1);
                    libro.setCopieInPrestito(libro.getCopieInPrestito() + 1);

                    System.out.println("Hai preso in prestito '" + titolo + "'.");
                    
                } else {

                    System.out.println("Spiacenti, le copie di '" + titolo + "' sono esaurite.");
                }

                //se c'è una corrispondenza cambio a true il valore 
                libroTrovato = true;
            }
        }

        //se alla fine del ciclo il valore è ancora false il libro inserito non è presente nella lista
        if (libroTrovato == false){

            System.out.println("Il libro '" + titolo + "' non è presente nella lista");
        }
    }

    //metodo per restituire un libro preso in prestito
    public void restituisciLibro(String titolo) {

        //ciclo per ogni oggetto libro all'interno della lista
        for (Libro libro : listaLibri) {

            //se il titolo corrisponde a uno della lista aggiorno i dati
            if (libro.getTitolo().equals(titolo)) {

                if (libro.getCopieInPrestito() > 0) {

                    libro.setCopieDisponibili(libro.getCopieDisponibili() + 1);
                    libro.setCopieInPrestito(libro.getCopieInPrestito() - 1);

                    System.out.println("Hai restituito '" + titolo + "'.");

                } else {

                    System.out.println("Errore: Non hai preso in prestito una copia di '" + titolo + "'.");
                }

                libroTrovato = true;
            }
        }
        
        //se non viene trovata una corrispondenza viene ddato un messaggio di errore
        if (libroTrovato == false){

            System.out.println("Il libro '" + titolo + "' non è presente nella lista");
        }
    }

    //l'utente può aggiungere un libro alla lista
    public void aggiungiLibro() {

        System.out.print("Inserisci il titolo del libro: ");
        String titolo = scanner.nextLine();

        System.out.print("Inserisci il numero di copie disponibili: ");
        int copieDisponibili = scanner.nextInt();

        listaLibri.add(new Libro(titolo, copieDisponibili, 0));
        System.out.println("Libro aggiunto con successo alla biblioteca.");
    }

    //metodo che permette all'utente di rimuovere un libro dalla lista
    public void rimuoviLibro() {

        //l'utente seleziona il libro da rimuovere
        System.out.print("Inserisci il titolo del libro da rimuovere: ");
        String titolo = scanner2.nextLine();

        boolean libroRimosso = false;

        //ciclo la lista di libri
        for (int i = 0; i < listaLibri.size(); i++) {

            //se trovo una corrispondenza rimuovo il libro dalla lista
            if (listaLibri.get(i).getTitolo().equalsIgnoreCase(titolo)) {

                listaLibri.remove(i);
                libroRimosso = true;

                System.out.println("'" + titolo + "' rimosso con successo dalla biblioteca.");
                break;
            }
        }

        // se a fine ciclo non è stata trovata corrispondenza mando messaggio di errore
        if (!libroRimosso) {
            System.out.println("Il libro specificato non è presente nella biblioteca.");
        }
    }
}
