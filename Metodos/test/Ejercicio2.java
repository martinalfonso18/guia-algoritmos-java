/*
2)Diseñe un algoritmo que lea un número y mediante una
función regrese el valor de 1 si el número es positivo y -1 si es negativo).
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class Ejercicio2 {
    //metodos
    static int Valor(int a){
       int x=0;
        if(a<0){
            x= -1;
        }
        if(a>0){
            x= 1;
        }
        return x;
        
    }
    public static void main(String args[]){
        int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n°"));
        System.out.println(Valor(a));
    }
    
}
