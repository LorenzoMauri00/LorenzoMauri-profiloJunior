package EsercizioBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[]args) {

        //creo oggetti scanner
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int sceltaUtente;

        System.out.println("Libri disponibili:\n");
        
        //creo un'istanza della classe Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //ottengo l'elenco dei libri dalla lista
        ArrayList<Libro> listaLibri = biblioteca.getListaLibri();

        //ciclo la lista dei libri e stampo i dati per controllo
        for (Libro libro : listaLibri) {
            System.out.println("Titolo: " + libro.getTitolo() + ", " + libro.getCopieDisponibili());
        }

        do {

            //l'utente sceglie che azione compiere
            System.out.println("Cosa vuoi fare?\n1: prendi in prestito un libro\n2: restituisci un libro\n3: aggiungi un libro alla lista\n4: rimuovi un libro dalla lista\n5: esci dal programma");
            sceltaUtente = scanner.nextInt();

            String titolo;

            //in base alla scelta dell'utente richiamo ad ogni iterazione un metodo diverso
            switch (sceltaUtente) {
                
                case 1:

                    System.out.println("Inserire il titolo del libro desiderato.");
                    titolo = scanner2.nextLine();

                    biblioteca.prestaLibro(titolo);    
                    break;

                case 2:

                    System.out.println("Inserire il titolo del libro desiderato.");
                    titolo = scanner2.nextLine();

                    biblioteca.restituisciLibro(titolo);   
                    break;

                case 3:

                    biblioteca.aggiungiLibro();
                    break;

                case 4:

                    biblioteca.rimuoviLibro();
                    break;
            
                default:
                    System.out.println("Programma terminato");
            }

        } while (sceltaUtente < 5);
            
        //ciclo la lista dei libri e stampo i dati per controllo
        for (Libro libro : listaLibri) {
            System.out.println("Titolo: " + libro.getTitolo() + ", " + libro.getCopieDisponibili());
        }
    }
}
    

