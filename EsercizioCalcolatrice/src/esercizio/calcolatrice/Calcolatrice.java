package esercizio.calcolatrice;

import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
			
		//creo oggetto scanner e ricevo il numero dall'utente
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserire un numero binario da convertire");
		String numeroBinario = scanner.nextLine();
		
		//
		int lunghezza = numeroBinario.length();
        int numeroDecimale = 0;
        
        //cilo la stringa partendo dall'utlimo carattere
		for (int i = 0; i < lunghezza; i++) {
			
            //ogni carattere viene convertito a valore int
            int bit = Character.getNumericValue(numeroBinario.charAt(lunghezza - 1 - i));
            
            //conversione a decimale
            numeroDecimale += bit * Math.pow(2, i);
        }
		
		//stampo il risultato dopo la conversione
		System.out.println("Il numero decimale corrispondente è: " + numeroDecimale);
	}
}
