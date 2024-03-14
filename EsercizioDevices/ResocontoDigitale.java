package EsercizioDevices;

import java.util.Scanner;
import java.util.ArrayList;

class ResocontoDigitale {

    public static void main (String[]args){

        //creo delle istanze di ogni classe
        DispositivoElettronico device = new DispositivoElettronico();
        Smartphone smartphone = new Smartphone();
        Tablet tablet = new Tablet();

        //creo oggetto scanner e variabili
        Scanner scanner = new Scanner(System.in);
        String sceltaUtente = "";
        int cont = 0;

        //tramite questi oggetti devo prendere i valori e stamparli/assegnarli
        ArrayList<String> listaUtenti = new ArrayList<String>();
        ArrayList<String> listaPassword = new ArrayList<String>();
        ArrayList<Integer> puntiUtente = new ArrayList<Integer>();
        ArrayList<Integer> idUtente = new ArrayList<Integer>();

        //ciclo che mi permette di eseguire il programma finchè l'utente non sceglie di smettere
        do {

            //ricevo la scelta dell'utente
            System.out.println("Vuoi avviare un applicazione? (Si/No)");
            sceltaUtente = scanner.nextLine();
            
            //se la scelta è "SI" procedo
            if (sceltaUtente.toUpperCase().equals("SI")){
                
                //
                device.avviaApplicazione("Youtube");
                smartphone.avviaApplicazione("Instagram");
                tablet.avviaApplicazione("Twitch");

                //aggiungo alle liste i rispettivi valori incrementando l indice a ogni ciclo
                listaUtenti.add(smartphone.listaUtenti.get(cont));
                listaPassword.add(smartphone.listaPassword.get(cont));
                puntiUtente.add(tablet.listaPunti.get(cont));
                idUtente.add(tablet.listaId.get(cont));

                //stampo le liste per controllo
                System.out.println(listaUtenti);
                System.out.println(listaPassword);
                System.out.println(puntiUtente);
                System.out.println(idUtente);

                //stampo i dati dell'utente
                System.out.println("Nome utente: " + listaUtenti.get(cont) + "\nPassword: " + listaPassword.get(cont) + "\nPunti: " + puntiUtente.get(cont) + "\nId: " + idUtente.get(cont));

                //incremento il contatore
                cont++;

            } else {System.out.println("Nessuna applicazione avviata");}

        } while (sceltaUtente.toUpperCase().equals("SI"));
    }
}
