package EsercizioDevices;

import EsercizioDevices.DispositivoElettronico;

import java.util.ArrayList;

class Tablet extends DispositivoElettronico {

    //tramite l'Override vado a modificare un metodo della classe padre
    @Override

    void avviaApplicazione(String nomeApp){

        //tramite super aggiungo le righe di codice successive al metodo avviaApplicazione
        super.avviaApplicazione(nomeApp);

        //richiamo il metodo assegnaPunti in modo che venga eseguito all'avvio dell'app
        assegnaPunti();

        //richiamo il metodo che assegna un valore id all'utente e gli passo il valore 0
        int idUtente = 0;
        assegnaId(idUtente);
    }
    
    //metodo per assegnare punti all'utente
    void assegnaPunti(){

        //assegno un valore randomico ai puntiUtente
        int puntiUtente = (int)(Math.random() * 101);
    }

    //metodo che riceve un valore e lo incrementa di uno
    void assegnaId(int idUtente){

        //poichè l'id deve partire da 1, assegno valore iniziale 0 e a ogni chiamata incremento di 1
        idUtente++;
    }
}
