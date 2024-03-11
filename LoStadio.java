
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

        while(cont < numWeekend){

            arraySabato.add(10000 + (int)(Math.random() * 65818));
            arrayDomenica.add(10000 + (int)(Math.random() * 65818));

            //
            cont++;
        }


        System.out.println("Sabato: " + arraySabato + ".\nDomenica: " + arrayDomenica + ".");
    }
    
}
