
package primerproyecto;

import javax.swing.JOptionPane; // paquete importado para poder usar el joptionpanel

/**
 *
 * @author Riva
 */
public class PrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("soy ian");
       byte edad=21; // tipo de dato primitivo
       float nota1=10;
       float nota2=4;
       float nota3=7;
       float promedio=(nota1+nota2+nota3)/3;
       float nota=9.55f; //sin la f es doble precision
       String nombre="ian"; //dato de tipo clase, empieza con mayuscula
        System.out.println("tengo "+edad+" años");
        System.out.println("Me llamo "+nombre+", mi promedio es: "+promedio);
        nota1=8;
        nota2=4;
        nota3=2;
        promedio=(nota1+nota2+nota3)/3;
        System.out.println("Me llamo "+nombre+", mi promedio es: "+promedio);
        
        double pi=3.1;
        char caracter='a';
        float promedio1=3.1f;
        System.out.println("el numero pi vale "+pi+" la primer letra del abecedario es "+caracter+" y mi promedio es: "+promedio1);
        boolean decision=true; //boolean puede ser true o false
        System.out.println(decision);
        nombre=JOptionPane.showInputDialog("ingrese su nombre");  //cuadro de texto para ingresar el nombre 
        nota=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota"));// parseFloat convierte a flotante
        edad= (byte) Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        if (nota>7){
            System.out.println("el alumno "+nombre+" esta aprobado.tiene "+edad);
            System.out.println("muy bueno");
        }
        else{
            if(nota>=5&&nota<=7){
                System.out.println("regular");
            }
            else{
                System.out.println("Insuficiente");
            }
        }

        
        
        
        if (decision== true){
            System.out.println("decision es verdadera");
            edad=90;
        }
        else{
            System.out.println("decision es falsa");
        }
    }
    
}


/*
perdir que se ingrese un apellido. el programa debera controlar que no 
ocurra un error comun que es repetir la primera letra.
cuando ocurra debera responder con un mensaje de error. solo no se considerarar error cuando la letra repetida sea una L
*/
 