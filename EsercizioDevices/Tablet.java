package EsercizioDevices;

import java.util.ArrayList;

class Tablet extends DispositivoElettronico {

    int idUtente = 0;

    //creo liste per punti e id degli utenti
    ArrayList <Integer> listaPunti = new ArrayList <Integer>();
    ArrayList <Integer> listaId = new ArrayList <Integer>();

    //tramite l'Override vado a modificare un metodo della classe padre
    @Override

    void avviaApplicazione(String nomeApp){

        //tramite super aggiungo le righe di codice successive al metodo avviaApplicazione
        super.avviaApplicazione(nomeApp);

        //richiamo il metodo assegnaPunti in modo che venga eseguito all'avvio dell'app
        assegnaPunti();

        //richiamo il metodo che assegna un valore id all'utente e gli passo il valore 0
        assegnaId();
    }
    
    //metodo per assegnare punti all'utente
    void assegnaPunti(){

        //assegno un valore randomico ai puntiUtente
        int puntiUtente = (int)(Math.random() * 101);

        //aggiungo il valore dei punti utente alla lista
        listaPunti.add(puntiUtente);
    }

    //metodo che riceve un valore e lo incrementa di uno
    void assegnaId(){

        //poichè l'id deve partire da 1, assegno valore iniziale 0 e a ogni chiamata incremento di 1
        idUtente++;

        //aggiungo il valore id dell'utente alla lista
        listaId.add(idUtente);
    }
}
