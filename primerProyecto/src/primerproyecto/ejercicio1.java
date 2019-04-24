/*
 1) tomando 2 valores averiguar si el primero es divisible por el segundo
 */
package primerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class ejercicio1 {
    public static void main(String[] args){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        if(num1%num2==0){
            System.out.println("El número "+num1+" es divisible por el número "+num2);
        }
        else{
            System.out.println("El número "+num1+" NO es divisible por el número "+num2);
        }
    }
}
