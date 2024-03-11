
import java.util.Scanner;
import java.util.ArrayList;

public class LoStadio {

    public static void main (String[]args){

        //
        Scanner scannerWeekend = new Scanner(System.in);

        System.out.println("Quanti weekend vuoi simulare?");
        int numWeekend = (scannerWeekend.nextInt());

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

        int minSabato = arraySabato.get(0);
        int maxSabato = arraySabato.get(0);
        int indexMinSab = 0;
        int indexMaxSab = 0;

        //
        for (int i = 0; i < arraySabato.size(); i++){

            //
            if (arraySabato.get(i) < minSabato){
                minSabato = arraySabato.get(i);
            }

            //
            if (arraySabato.get(i) > maxSabato){
                maxSabato = arraySabato.get(i);
            }

            //
            indexMinSab = arraySabato.indexOf(minSabato) + 1;
            indexMaxSab = arraySabato.indexOf(maxSabato) + 1;
        }

        //
        int minDomenica = arrayDomenica.get(0);
        int maxDomenica = arrayDomenica.get(0);
        int indexMinDom = 0;
        int indexMaxDom = 0;

        //
        for (int i = 0; i < arraySabato.size(); i++){

            //
            if (arraySabato.get(i) < minSabato){
                minSabato = arraySabato.get(i);
            }

            //
            if (arraySabato.get(i) > maxSabato){
                maxSabato = arraySabato.get(i);
            }

            //
            indexMinSab = arraySabato.indexOf(minSabato) + 1;
            indexMaxSab = arraySabato.indexOf(maxSabato) + 1;
        }

        System.out.println("Il sabato con minor affluenza è il " + indexMinSab + "°: " + minSabato + ".\nIl sabato con maggior affluenza è il " + indexMaxSab + "°: " + maxSabato);

        System.out.println("Sabato: " + arraySabato + ".\nDomenica: " + arrayDomenica + ".");
    }
    
}
