package EsercizioDevices;

import java.util.ArrayList;
import java.util.Scanner;

class Smartphone extends DispositivoElettronico {

    String nomeUtente = "";
    String password = "";

    ArrayList <String> listaUtenti = new ArrayList <String>();
    ArrayList <String> listaPassword = new ArrayList <String>();


    //tramite l'Override vado a modificare un metodo della classe padre
    @Override

    void avviaApplicazione(String nomeApp){

        //tramite super aggiungo le righe di codice successive al metodo avviaApplicazione
        super.avviaApplicazione(nomeApp);

        //richiamo il metodo logging in modo che venga eseguito all'avvio dell'app
        logging();
    }

    //creo metodo logging che riceve i dati utente e li salva nelle variabili
    void logging() {

        // Creo un oggetto scanner per leggere l'input dall'utente
        Scanner scanner = new Scanner(System.in);

        do {

            // Chiedo all'utente di inserire il nome utente
            System.out.println("Inserire il nome utente: ");
            nomeUtente = scanner.nextLine();

            //se il nome utente è inferiore a 8 caratteri mando messaggio di errore
            if (nomeUtente.length() < 4){System.out.println("Il nome utente deve avere almeno 4 caratteri ");}

            // Chiedi all'utente di inserire la password
            System.out.println("Inserire la password: ");
            password = scanner.nextLine();

            //se la password è inferiore a 8 caratteri mando messaggio di errore
            if(password.length() < 8){System.out.println("La password deve avere almeno 8 caratteri");}

        } while (nomeUtente.length() < 4 || password.length() < 8 );

        //se i dati inseriti rispettano i parametri li aggiungo alla lista
        listaUtenti.add(nomeUtente);
        listaPassword.add(password);

    }
}
    

