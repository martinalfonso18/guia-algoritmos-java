/*
1)generar la tabla de multiplicar de un numero ingresado por el usuario,
su resultado se debe guardar en el arreglo
*/
package primerproyecto.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class Arreglos1 {
    public static void main(String[] args){
        int num; //numero que se usa para calcular la tabla
        int dim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de números a considerar en la tabla"));
        int tabla[]=new int[dim];
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del que quiere calcular la tabla"));
        for(int i=0;i<tabla.length;i++){
            tabla[i]=num*i;
            System.out.println(tabla[i]);
        }
            
    }
}
