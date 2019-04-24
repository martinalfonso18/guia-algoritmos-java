/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class Arreglos {
    public static void main(String[] args){
        
        float notas[]=new float[5]; //reservo memoria en RAM
        float acum=0f,promedio;
        /*
        System.out.println("Mostrar: "+notas);//muestra direccion de memoria
        System.out.println("Primer nota: "+notas[0]); //muestra primer lugar
        notas[1]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese 2da nota"));
        System.out.println(notas[1]);
        */
        for(int m=0;m<notas.length;m++){
            do{
                notas[m]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota n° "+(m+1)));
            }while (notas[m]<0&&notas[m]>10);
            System.out.println("La nota "+(m+1)+" es igual a "+notas[m]);
            acum+=notas[m]; //acum= acum+notas[m]
            
        }
        promedio=acum/notas.length;
        System.out.println("El promedio es: "+promedio);
        
    }
}
