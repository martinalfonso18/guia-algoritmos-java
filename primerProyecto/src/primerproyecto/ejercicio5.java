/*
5) suponiendo que se conocen ciertos sintomas que sugieren enfermedades.
el programa debera mostrar los sintomas conocidos. 
cada sintoma estara acompañado por un numero.
el programa debera pedir al operador uno de los sintomas utilizando el numero. 
en respuesta a su eleccion debera mostrar la enfermedad que padece.
 */
package primerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class ejercicio5 {
    public static void main(String[] args){   //System.lineSeparator() salto de linea
        
        //JOptionPane.showMessageDialog(null, "Ingrese el número del sintoma que padece:");
        int sintoma=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del sintoma que posee:" +System.lineSeparator()+
                 "1.dolor de cabeza"+System.lineSeparator()+"2.dolor en el pecho"+System.lineSeparator()+"3.dolor de panza"));
        switch(sintoma){
            case 1:
                JOptionPane.showMessageDialog(null, "Usted padece cancer cerebral xd");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Usted padece de cancer pulmonar");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted padece de cancer en el estomago");
                break;
        }
    }
}
