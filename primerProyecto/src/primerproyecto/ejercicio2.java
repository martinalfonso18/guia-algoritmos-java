/*
 2) tomando 2 valores mostrar solo el mayor
 */
package primerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class ejercicio2 {
    public static void main(String[] args){
        float num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese primer numero"));
        float num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese segundo numero"));
        if(num1>num2){
            System.out.println("El mayor número es: "+num1);
        }
        else{
            if(num1<num2){
                System.out.println("El mayor número es: "+num2);
            }
            else{
                System.out.println("Los números son iguales");
            }
        }
    }
}
