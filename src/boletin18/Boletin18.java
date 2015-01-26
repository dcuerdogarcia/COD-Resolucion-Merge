package boletin18;
/*
* Author dcuerdogarcia.
*/
public class Boletin18 {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            double random = Math.random() * 50 + 1;
            int valor = (int) random;
            numeros[i] = valor;
            System.out.println("Elemento " + (i + 1) + " --> " + numeros[i]);
        }

        System.out.println("\n");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + " --> " + numeros[i]);
        }
    }
}
