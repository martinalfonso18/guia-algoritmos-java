/*
 4) tomando un numero arbitrario de notas obtener el promedio de las mismas.
si ese promedio es mayor o igual a 7 se mostrara el resultado con el texto aprobado,
en el caso contrario se mostrara con el texto desaprobado
 */
package primerproyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class ejercicio4 {
    public static void main(String[] args){
        int num=1;//auxiliar para mostrar el numero de nota a ingresar; divisor del promedio; luego se debe restar 1
        float nota;
        float promedio;
        float acumulador=0;
        float cant;
        do{
            cant=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad de notas a promediar"));
            if(cant%1!=0){
                JOptionPane.showMessageDialog(null, "Ingrese un número entero");
                System.out.println("Ingrese un número entero");
            }
        }while(cant%1!=0);//verifica que se ingrese un entero
        
        while(cant>0){
            nota=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota número "+num));
            num++;
            acumulador=acumulador+nota;
            cant--;
        }
        num--;//el contador habia empezado en 1
        promedio=acumulador/num;
        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        System.out.println("El promedio es: "+promedio);
    }
}
