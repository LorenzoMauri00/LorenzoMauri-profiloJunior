import java.util.ArrayList;
import java.util.Scanner;

public class Pasticceria {
    public static void main (String[]args){

        //creo oggetto scanner per ricevere le scelte dell'utente
        Scanner scannerScelta = new Scanner(System.in);

        //creo degli oggetti lista per contenere i vari ingredienti
        ArrayList <String> basi = new ArrayList<String>();
        ArrayList <String> ripieni = new ArrayList<String>();
        ArrayList <String> frutti = new ArrayList<String>();
        ArrayList <String> decorazioni = new ArrayList<String>();

        ArrayList <String> dolceCliente = new ArrayList<String>();

        //popolo le liste con i valori predefiniti
        basi.add("Pan di Spagna");
        basi.add("Biscotto");
        basi.add("Brioches");

        ripieni.add("Crema");
        ripieni.add("Marmellata");
        ripieni.add("Nutella");

        frutti.add("Fragole");
        frutti.add("Banane");
        frutti.add("Mirtilli");

        decorazioni.add("Glassa al cioccolato");
        decorazioni.add("Zucchero a velo");
        decorazioni.add("Cacao in polvere");

        //comunico gli ingredienti disponibili al cliente
        System.out.println("Ingredienti disponibili: \n Basi: " + basi + "\n Ripieni: " + ripieni + "\n Frutti: " + frutti + "\n Decorazioni: " + decorazioni + "\n");

        //
        System.out.println("Per la scelta manuale digitare 1, per la scelta casuale digitare 2");
        int userChoice = (scannerScelta.nextInt());

        if (userChoice == 1){

            //il cliente seleziona la base
            System.out.println("Selezionare la base: digitare 1 per Pan di Spagna, 2 per Biscotto, 3 per Brioches");
            int userBasi = (scannerScelta.nextInt());

            //seleziono la base corrispondente
            switch (userBasi) {
                case 1:
                    dolceCliente.add(basi.get(0));
                    break;
                case 2:
                    dolceCliente.add(basi.get(1));
                    break;
                case 3:
                    dolceCliente.add(basi.get(2));
                    break;
            
                default:
                    System.out.println("La selezione della base non è valida");
            }

            //il cliente seleziona il ripieno
            System.out.println("Selezionare il ripieno: digitare 1 per Crema, 2 per Marmellata, 3 per Nutella");
            int userRipieno = (scannerScelta.nextInt());

            //seleziono il ripieno corrispondente
            switch (userRipieno) {
                case 1:
                    dolceCliente.add(ripieni.get(0));
                    break;
                case 2:
                    dolceCliente.add(ripieni.get(1));
                    break;
                case 3:
                    dolceCliente.add(ripieni.get(2));
                    break;
            
                default:
                    System.out.println("La selezione del ripieno non è valida");
            }

            //il cliente seleziona i frutti
            System.out.println("Selezionare i frutti: digitare 1 per Fragole, 2 per Banane, 3 per Mirtilli");
            int userFrutti = (scannerScelta.nextInt());

            //seleziono il frutto corrispondente
            switch (userFrutti) {
                case 1:
                    dolceCliente.add(frutti.get(0));
                    break;
                case 2:
                    dolceCliente.add(frutti.get(1));
                    break;
                case 3:
                    dolceCliente.add(frutti.get(2));
                    break;
            
                default:
                    System.out.println("La selezione dei frutti non è valida");
            }

            //il cliente seleziona la decorazione
            System.out.println("Selezionare le decorazioni: digitare 1 per Glassa al Cioccolato, 2 per Zucchero a velo, 3 per Cacao in polvere");
            int userDecoration = (scannerScelta.nextInt());

            //seleziono la decorazione corrispondente
            switch (userDecoration) {
                case 1:
                    dolceCliente.add(decorazioni.get(0));
                    break;
                case 2:
                    dolceCliente.add(decorazioni.get(1));
                    break;
                case 3:
                    dolceCliente.add(decorazioni.get(2));
                    break;
            
                default:
                    System.out.println("La selezione della decorazione non è valida");
            }

        } else if (userChoice == 2){

        } else 
            System.out.println("Il numero digitato non corrisponde a nessuna opzione");
        
        //
        System.out.println(dolceCliente);
    }
}
