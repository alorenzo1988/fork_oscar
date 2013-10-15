/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa6;

/**
 *
 * @author TOSHIBA
 */
public class Programa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int valores[] = {90,7,45,28,89,13,51,76,64,33};
        int i, j, aux;
        int mida = valores.length;
        for (i = 0; i < mida - 1; i++) {
            for (j = 0; j < mida - i - 1; j++) {
                if (valores[j + 1] < valores[j]) {
                    aux = valores[j + 1];
                    valores[j + 1] = valores[j];
                    valores[j] = aux;
                         //Oscar Coleto esta aquí
                }
            }
        }
        for (i = 0; i < mida; i++) {
            System.out.println("Ordenados: " + valores[i]);
        }
    }
}
