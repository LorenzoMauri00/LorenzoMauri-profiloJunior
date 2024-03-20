package esercizi.pack;

import java.util.LinkedList;
import java.util.Random;

public class EsercizioUno {
	
	public static void main (String[]args) {
		
		//creo oggetti lista e random
		LinkedList<Integer> listaInteri = new LinkedList<Integer>();
		Random random = new Random();
		
		//ciclo per un numero di iterazioni prestabilito
		for (int i = 0; i < 6; i++) {
			
			//a ogni iterazione random restituisce un numero casuale che viene assegnato alla lista
	        int numeroCasuale = random.nextInt(100);
	        listaInteri.add(numeroCasuale);
		}
		
		//stampo la lista creata randomicamente
		System.out.println("Lista iniziale:\n" + listaInteri);
		
		//chiamo il metodo bubbleSort che andrà a riordinare la lista
		bubbleSort(listaInteri);
		
		//stampo la nuova lista ordinata dal numero minore al maggiore
		System.out.println("Lista ordinata:\n" + listaInteri);
	}
	
	//creo il metodo di assortimento della lista
	public static void bubbleSort(LinkedList<Integer> listaInteri) {
		
        for (int i = 0; i < listaInteri.size() - 1; i++) {
        	
            for (int j = 0; j < listaInteri.size() - i - 1; j++) {
            	
            	//se l'elemento con indice j è maggiore del successivo
                if (listaInteri.get(j) > listaInteri.get(j + 1)) {
                	
                    //inverto i due valori sfruttando una variabile temporanea
                    int temp = listaInteri.get(j);
                    listaInteri.set(j, listaInteri.get(j + 1));
                    listaInteri.set(j + 1, temp);
                }
            }
        }
    }
}
