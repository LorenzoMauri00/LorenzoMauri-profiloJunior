
import java.util.Scanner;

public class EsercizioOperazioni {

    public static void main (String[]args){

        //creo oggetto scanner per le scelte dell'utente e contatore per il numero operazioni svolte
        Scanner scannerScelta = new Scanner(System.in);
        int contaOperazioni = 0;

        //il ciclo simula un while, continua in loop finchè l'utente non sceglie di interromperlo
        for(int i = 0; i < 1;){

            //l'utente comunica se vuole svolgere un'operazione
            System.out.println("Vuoi eseguire un operazione?");
            String opSiNo = (scannerScelta.nextLine());

            if(opSiNo.toUpperCase().equals("SI")){

                //se l'utente vuole procedere deve scegliere quale operazione svolgere
                System.out.println("Che operazione vuoi eseguire?");
                String opScelta = (scannerScelta.nextLine());

                //in base alla scelta dell'utente svolgo la rispettiva operazione; in ogni caso incremento j
                switch (opScelta.toUpperCase()){
                    case "SOMMA":
                        int somma = 7 + 2; //verrà implementata la scelta addendi dell'utente
                        int sommaFake = (int)(Math.random() * 101);
                        System.out.println("Il risultato della somma di 7 e 2 è " + somma + "; il risultato randomico è " + sommaFake);
                        contaOperazioni++;
                        break;
                    case "SOTTRAZIONE":
                        int sottr = 9 - 1; //verrà implementata la scelta addendi dell'utente
                        int sottrFake = (int)(Math.random() * 101);
                        System.out.println("Il risultato della sottrazione di 9 e 1 è " + sottr + "; il risultato randomico è " + sottrFake);
                        contaOperazioni++;
                        break;
                    case "MOLTIPLICAZIONE":
                        int moltip = 3 * 6; //verrà implementata la scelta addendi dell'utente
                        int moltipFake = (int)(Math.random() * 101);
                        System.out.println("Il risultato della moltiplicazione di 3 e 6 è " + moltip + "; il risultato randomico è " + moltipFake);
                        contaOperazioni++;
                        break;
                    case "DIVISIONE":
                        int div = 9 / 3; //verrà implementata la scelta addendi dell'utente
                        int divFake = (int)(Math.random() * 101);
                        System.out.println("Il risultato della divisione di 9 e 3 è " + div + "; il risultato randomico è " + divFake);
                        contaOperazioni++;
                        break;
                    default:
                        System.out.println("Operazione scelta non valida");
                }
            } else {

                //se l'utente non vuole svolgere operazioni incremento i ed esco dal ciclo
                i++;
            }

            //stampo il numero di operazioni svolte
            System.out.println("Hai svolto " + contaOperazioni + " operazioni.");
        }
    }
}
