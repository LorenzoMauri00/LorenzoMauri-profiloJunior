package EsercizioDevices;

import java.util.Scanner;

import EsercizioDevices.DispositivoElettronico;

class Smartphone extends DispositivoElettronico {

    //
    @Override

    void avviaApplicazione(String nomeApp){

        //tramite super aggiungo le righe di codice successive al metodo avviaApplicazione
        super.avviaApplicazione(nomeApp);

        //richiamo il metodo logging in modo che venga eseguito all'avvio dell'app
        logging();
    }

    //
    void logging() {

        // Creo un oggetto scanner per leggere l'input dall'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire il nome utente e la password
        System.out.println("Inserire il nome utente:");
        String nomeUtente = scanner.nextLine();
        System.out.println("Inserire la password:");
        String password = scanner.nextLine();

    }
}
    

