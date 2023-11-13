//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e
// gestista sia l'eccezione della divisione che quella di indice non presente nell'array,
// leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.


public class Main {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 0, 5};

        for (int i = 0; i < numeri.length; i++) {
            try {
                int risultato = dividi(numeri, i);
                System.out.println("Risultato: " + risultato);
            } catch (ArithmeticException e) {
                System.out.println("Errore di divisione per 0: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("indice non presente nell'array: " + e);
            }
        }
    }

    public static int dividi(int[] array, int indice) {
        try {
            return array[3] / 0;
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione per 0: " + e);
        }
        return indice;
    }
}
