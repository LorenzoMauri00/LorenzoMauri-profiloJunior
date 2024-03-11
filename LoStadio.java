
import java.util.Scanner;
import java.util.ArrayList;

public class LoStadio {

    public static void main (String[]args){

        //creo oggetto scanner per scelta utente del numero di weekend
        Scanner scannerWeekend = new Scanner(System.in);

        System.out.println("Quanti weekend vuoi simulare?");
        int numWeekend = (scannerWeekend.nextInt());

        //creo le liste che conterranno i dati di affluenza
        ArrayList <Integer> arraySabato = new ArrayList<Integer>();
        ArrayList <Integer> arrayDomenica = new ArrayList<Integer>();

        int cont = 0;
        //eseguo il ciclo finchè il contatore è inferiore ai weekend selezionati dall'utente
        while(cont < numWeekend){

            //popolo gli array con valori randomizzati
            arraySabato.add(10000 + (int)(Math.random() * 65818));
            arrayDomenica.add(10000 + (int)(Math.random() * 65818));

            //incremento il contatore
            cont++;
        }

        //dichiaro le variabili per il sabato
        int minSabato = arraySabato.get(0);
        int maxSabato = arraySabato.get(0);
        int indexMinSab = 0;
        int indexMaxSab = 0;

        //ciclo per la dimensione dell'array dei sabati
        for (int i = 0; i < arraySabato.size(); i++){

            //calcolo affluenza minima tra i sabati
            if (arraySabato.get(i) < minSabato){
                minSabato = arraySabato.get(i);
            }

            //calcolo affluenza massima tra i sabati
            if (arraySabato.get(i) > maxSabato){
                maxSabato = arraySabato.get(i);
            }

            //trovo l'indice dei sabati con la minore e maggiore affluenza
            indexMinSab = arraySabato.indexOf(minSabato) + 1;
            indexMaxSab = arraySabato.indexOf(maxSabato) + 1;
        }

        //dichiaro le variabili per la domenica
        int minDomenica = arrayDomenica.get(0);
        int maxDomenica = arrayDomenica.get(0);
        int indexMinDom = 0;
        int indexMaxDom = 0;

        //ciclo per le dimensioni dell'array delle domeniche
        for (int i = 0; i < arrayDomenica.size(); i++){

            //calcolo affluenza minima tra le domeniche
            if (arrayDomenica.get(i) < minDomenica){
                minDomenica = arrayDomenica.get(i);
            }

            //calcolo affluenza massima tra le domeniche
            if (arrayDomenica.get(i) > maxDomenica){
                maxDomenica = arrayDomenica.get(i);
            }

            //trovo l'indice delle domeniche con la minore e maggiore affluenza
            indexMinDom = arrayDomenica.indexOf(minDomenica) + 1;
            indexMaxDom = arrayDomenica.indexOf(maxDomenica) + 1;
        }

        //
        

        //stampo le due liste
        System.out.println("Sabato: " + arraySabato + ".\nDomenica: " + arrayDomenica + ".");

        //stampo min e max per sabato e domenica con i rispettivi indici
        System.out.println("Il sabato con minor affluenza è il " + indexMinSab + "°: " + minSabato + ".\nIl sabato con maggior affluenza è il " + indexMaxSab + "°: " + maxSabato);
        System.out.println("La domenica con minor affluenza è la " + indexMinDom + "°: " + minDomenica + ".\nLa domenica con maggior affluenza è il " + indexMaxDom + "°: " + maxDomenica);
    }
}
