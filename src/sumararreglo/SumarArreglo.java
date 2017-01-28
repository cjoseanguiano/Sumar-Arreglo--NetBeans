/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumararreglo;

/**
 *
 * @author carlosjoseanguiano
 */
public class SumarArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se define el tamaño del arreglo
        int[] arreglo = {1,2,3,4,5,6};
        //La variable total contiene el valor de 0
        int total=0;
        
        //Se recorre el ciclo, siempre y cuando sea menor que el tamaño del arreglo
        for (int i = 0; i < arreglo.length; i++) 
            //La variable total suma lo que contiene el valor de i
            total += arreglo[i];
         
            System.out.printf("La Suma es %s\n" , total);
        
    }
    
}
