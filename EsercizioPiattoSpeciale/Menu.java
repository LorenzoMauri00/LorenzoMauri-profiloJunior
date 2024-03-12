package EsercizioPiattoSpeciale;
import java.util.Scanner;
import EsercizioPiattoSpeciale.PiattoSpeciale;

public class Menu {

    public static void main (String[]args){

        //
        Scanner scannerScelta = new Scanner(System.in);

        //
        do {

            System.out.println("Selezionare la base del piatto: 1 per il pane (1 euro), 2 per la focaccia (2 euro)");
            int sceltaPiatto = scannerScelta.nextInt();

            int prezzoPiatto;

            //
            switch (sceltaPiatto) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;
            
                default:

                    System.out.println("Selezionare una base tra quelle disponibili");
                    break;
            }
        } while (sceltaPiatto != 1 || sceltaPiatto != 2);

    }
    
}
