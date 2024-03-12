package EsercizioPiattoSpeciale;
import java.util.Scanner;
import EsercizioPiattoSpeciale.PiattoSpeciale;

public class Menu {

    public static void main (String[]args){

        //
        Scanner scannerScelta = new Scanner(System.in);
        Scanner scannerSceltaDue = new Scanner(System.in);

        int sceltaPiatto = 0;
        int prezzoPiatto = 0;
        String ingredienteBase = "";


        //
        do {

            System.out.println("Selezionare la base del piatto: 1 per il pane (1 euro), 2 per la focaccia (2 euro)");
            sceltaPiatto = scannerScelta.nextInt();

            //
            switch (sceltaPiatto) {
                case 1:

                    prezzoPiatto = 1;
                    ingredienteBase = "pane";
                    break;

                case 2:
                    
                    prezzoPiatto = 2;
                    ingredienteBase = "Focaccia";
                    break;
            
                default:

                    System.out.println("Selezionare una base tra quelle disponibili");
                    break;
            }
        } while (sceltaPiatto != 1 && sceltaPiatto != 2);

        System.out.println("Selezionare ingrediente a scelta tra marmellata (1 euro) e nutella (2 euro)");
        String ingredienteAScelta = scannerSceltaDue.nextLine();
        int prezzoIngredienteAScelta = 0;

        switch (ingredienteAScelta.toUpperCase()) {
            case "MARMELLATA":

                prezzoIngredienteAScelta = 1;
                break;

            case "NUTELLA":
                
                prezzoIngredienteAScelta = 2;
                break;
        
            default:

                System.out.println("L'ingrediente selezionato non è tra quelli previsti, quindi il suo costo sarà di 5 euro");
                prezzoIngredienteAScelta = 5;
                break;
        }

        //
        PiattoSpeciale piatto = new PiattoSpeciale(ingredienteBase);
        piatto.calcolaPrezzoTotale(prezzoPiatto);

        piatto.addIngredienteAScelta(ingredienteAScelta, prezzoIngredienteAScelta);

        System.out.println("Gli ingredienti selezionati sono " + piatto.getIngredienteFisso() + " e " + piatto.getIngredienteAScelta() + ".");
        System.out.println("Per un totale di " + piatto.getPrezzoTotale() + " euro di cui 1 euro di servizio al tavolo");

    }
    
}
