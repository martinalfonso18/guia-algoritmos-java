/*
3) llenar 2 vectores, a y b,donde cada uno tiene una dimension de 25.
completar a ambos con valores enteros al azar. 
sumar cada elemento del vector a con su correspondiente del vector b.
guardar el resultado de  cada suma en un tercer vector, al terminar,
mostrar los 3 vectores
 */
package primerproyecto.arreglos;
import java.lang.Math;

/**
 *
 * @author Riva
 */
public class Arreglos3 {
    public static void main(String[] args){
        int a[]=new int[25];
        int b[]=new int[25];
        int c[]=new int[25];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*1000)+1;
            b[i]=(int)(Math.random()*1000)+1;
            c[i]=a[i]+b[i];
            System.out.println("El dato n° "+(i+1)+" del primer vector es: "+a[i]);
            System.out.println("El dato n° "+(i+1)+" del segundo vector es: "+b[i]);
            System.out.println("El dato n° "+(i+1)+" de la suma de vectores es: "+c[i]);
        }
    }
}
