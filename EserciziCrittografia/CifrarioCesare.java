
package EserciziCrittografia;

public class CifrarioCesare {
    //inizializzazione variabili dizionario lettere e numeri
    private static final String DIZIONARIO_LETTERE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIZIONARIO_NUMERI = "1234567890";

    public static void main(String[] args) {

        if (args.length < 4) {
            System.out.println("Uso <messaggio> <shift_lettere> <shift_numeri> <modalità(0/1)>");
            return;
        }

        //l'utente passa <messaggio_da_cifrare_o_decifrare> <numero_di_shift_lettere> <numero_di_shift_numeri> <modalità (0/1)> 0 -> Crittografia , 1 -> Decrittografia);
        String messaggio = args[0].toLowerCase();
        int shiftLettere = Integer.parseInt(args[1]);
        int shiftNumeri = Integer.parseInt(args[2]);
        int modalità = Integer.parseInt(args[3]);
        
        String risultato = "";

        if (modalità == 0) {
            risultato = cifra(messaggio, shiftLettere, shiftNumeri);
        } else if (modalità == 1) {
            risultato = decifra(messaggio, shiftLettere, shiftNumeri);
        } else {
            System.out.println("Modalità non valida. Usa 0 per Crittografia e 1 per decrittografia");
            return;
        }

        System.out.println("Risultato : " + risultato);
    }

    //metodo per cifrare, richiama il metodo trasforma
    private static String cifra(String testo, int shiftLettere, int shiftNumeri) {
        return trasforma(testo, shiftLettere, shiftNumeri);
    }

    //metodo per cifrare, richiama il metodo trasforma
    private static String decifra(String testo, int shiftLettere, int shiftNumeri) {
        return trasforma(testo, -shiftLettere, -shiftNumeri);
    }

    //metodo traforma, cicla i caratteri e richiama cifraLettera o cifraNumero in base al tipo di carattere
    public static String trasforma(String testo, int shiftLettere, int shiftNumeri) {
        StringBuilder risultato = new StringBuilder();

        for (char carattere : testo.toCharArray()) {

            if (Character.isLetter(carattere)) {
                risultato.append(cifraLettera(carattere, shiftLettere));
            } else if (Character.isDigit(carattere)) {
                risultato.append(cifraNumero(carattere, shiftNumeri));
            } else {
                risultato.append(carattere);
            }
        }
        return risultato.toString();
    }

    //metodo per cifrare/decifrare le lettere
    private static char cifraLettera(char carattere, int shift) {

        int indice = DIZIONARIO_LETTERE.indexOf(carattere);
        int nuovaPosizione = (DIZIONARIO_LETTERE.length() + indice + shift) % DIZIONARIO_LETTERE.length();
        
        return DIZIONARIO_LETTERE.charAt(nuovaPosizione);
    }

    //metodo per cifrare/decifrare i numeri
    private static char cifraNumero(char carattere, int shift) {

        int indice = DIZIONARIO_NUMERI.indexOf(carattere);
        int nuovaPosizione = (DIZIONARIO_NUMERI.length() + indice + shift) % DIZIONARIO_NUMERI.length();
        
        return DIZIONARIO_NUMERI.charAt(nuovaPosizione);
    }
    
}
