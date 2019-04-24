/*
2) teniendo un arrglo dim 10, 
complete sus casilleros con valores enteros en forma azarosa
 */
package primerproyecto.arreglos;
import java.lang.Math;

/**
 *
 * @author Riva
 */
public class Arreglos2 {
    public static void main(String[] args){
        float lista[]= new float[10];
        for(int i=0;i<lista.length;i++){
            lista[i]=(float) (Math.random()*10)+1;// *10 llega hasta 10 ; +1 para que no de 0
            System.out.println(lista[i]);
        }
    }
}
