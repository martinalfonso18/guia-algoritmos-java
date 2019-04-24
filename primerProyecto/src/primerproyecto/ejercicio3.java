/*
3) toamando un valor indicar si el mismo es par o impar
 */
package primerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class ejercicio3 {
    public static void main (String[] args){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(num%2==0){
            System.out.println("El número "+num+" es par");
        }
        else{
            System.out.println("El número "+num+" es impar");
        }
        
    }
}
