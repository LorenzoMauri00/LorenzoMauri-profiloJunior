package esercizio.calcolatrice;

import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
			
		//
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserire un numero binario da convertire");
		String numeroBinario = scanner.nextLine();
		
		//
		int lunghezza = numeroBinario.length();
        int numeroDecimale = 0;
        
        //
		for (int i = 0; i < lunghezza; i++) {
			
            //
            int bit = Character.getNumericValue(numeroBinario.charAt(lunghezza - 1 - i));
            
            //
            numeroDecimale += bit * Math.pow(2, i);
        }
		
		//
		System.out.println("Il numero decimale corrispondente è: " + numeroDecimale);
	}
}
