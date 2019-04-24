
package vectoresymatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class VectoresYMatrices {

    //métodos
    public static void Vectores1(){
        System.out.println("Consigna 1: Llenar dos vectores A y B de 25 elementos cada uno, "
        + "sumar el elemento uno del vector A con el elemento uno del vector B "
        + "y así sucesivamente hasta el último, almacenar el resultado en un vector C."
        + " Mostrar los tres vectores");
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
    public static void Vectores2(){
        System.out.println("Consigna 2: Guarde al azar 50 valores en un vector. "
        + "Calcule el promedio de los mismos. \n" +
         "Determine cuántos son mayores que el promedio,"
        + " mostrar el promedio, el número de datos mayores que el promedio."
        + " Luego muestre una lista de valores mayores que el promedio.");
        int vector2[]= new int[50];
        int acumVector2=0;
        float promedioVector2;
        for(int j=0;j<vector2.length;j++){ //cargo el vector
            vector2[j]=(int)(Math.random()*100)+1;// aleatorios hasta 100
            System.out.println("El valor n° "+(j+1)+" es = "+vector2[j]);
            //acumulador para el promedio
            acumVector2=acumVector2+vector2[j];
        }
        promedioVector2=acumVector2/vector2.length; //promedio del vector
        System.out.println("El promedio del vector es igual a: "+promedioVector2);
        //valores mayores que el promedio
        int mayPromedioV2=0;//contador para numeros mayores que el promedio
        for(int j=0;j<vector2.length;j++){
            if(vector2[j]>promedioVector2){
                mayPromedioV2++;
                System.out.println("El número "+vector2[j]+" es mayor que el promedio");
            }
        }
        System.out.println("La cantidad de números mayores que el promedio es igual a: "+mayPromedioV2);                        
    }
    public static void Vectores3(){
        System.out.println("Consigna 3: Almacenar 15 números en un vector, generados al azar. "
        + "Almacénelos luego en otro vector en orden inverso al vector original."
        + " Luego muestre los dos vectores. ");
        //creo los vectores
        int v3a[]=new int[15];
        int v3b[]=new int[15];
        int v3bContador=14;//contador para el orden inverso del segundo vector
        for(int i=0;i<v3a.length;i++){//cargo los vectores
            v3a[i]=(int)(Math.random()*100)+1;//valores hasta 100, enteros positivos
            v3b[v3bContador]=v3a[i];
            v3bContador--;                     
        }
        //muestro los vectores
        for(int i=0;i<15;i++){
            System.out.println("Vector 1 valor n°"+(i+1)+" = "+v3a[i]+"; Vector 2 valor n°"+(i+1)+" = "+v3b[i]);
        }
    }
    public static void Vectores4(){
        System.out.println("Consigna 4: Teniendo 2 vectores cuya dimensión es 5 para ambos,"
        + " pida al usuario que ingrese los valores de ambos."
        + " Luego compare elemento por elemento. Si ambos tienen iguales todos sus elementos, "
        + "muestre el texto “iguales”."
        + " Si no, muestre el texto “distintos”. "
        + "Después muestre ambos vectores para comprobar."); 
        int v4a[]=new int[5];
        int v4b[]=new int[5];
        int iguales=0;//acumulador para saber si los vectores son iguales
        for(int i=0;i<5;i++){
            //ingreso valores
            v4a[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n°"+(i+1)+" del 1er vector"));
            v4b[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n°"+(i+1)+" del 2do vector"));
            if(v4a[i]==v4b[i]){
                iguales++;
            }
                                
        }
        if(iguales==5){
            System.out.println("Los vectores son IGUALES");
        }
        else{
            System.out.println("Los vectores son DISTINTOS");
        }
        for(int i=0;i<5;i++){//mostrar vectores
            System.out.println("Vector 1 lugar "+(i+1)+"= "+v4a[i]+" Vector 2 lugar "+(i+1)+"= "+v4b[i]);
        }
    }
    public static void Matrices1(){
        System.out.println("Consigna 1: Hacer un algoritmo que llene una matriz de n * n,"
            + " con valores enteros entre 1 y 25. Sumar las columnas e imprimir que "
            + "columna tuvo la máxima suma y la suma de esa columna.");
        
    }
    public static void Matrices2(){
        System.out.println("Consigna 2: Hacer un algoritmo que llene una matriz de 5 * 5 "
                                    + "y que almacene la diagonal principal en un vector. "
                                    + "Imprimir el vector resultante.");
        
    }
    public static void Matrices3(){
        System.out.println("Consigna 3: Hacer un algoritmo que llene una matriz de 5 * 5 y que almacene la"
                                    + " diagonal inversa en un vector. Imprimir el vector resultante.");
    }
    public static void Matrices4(){
        System.out.println("Consigna 4: Hacer un algoritmo que llene una matriz de 4 * 6 y "
                                    + "que almacene todos los valores del contorno en un vector. "
                                    + "La dimensión del vector debe ser exacta para la cantidad de elementos que deba contener."
                                    + " Mostrar el vector resultante.");
    }
    public static void Matrices5(){
        System.out.println("Consigna 5: Idem al anterior, pero con una dimensión de m x n "
                                    + "(significa que ambas dimensiones no se conocen y deben ser pedidas al usuario)");
    }
    /*
    
    MAIN
    
    */
    public static void main(String[] args) {
        int elegir;// variable que sirve para elegir el práctico a revisar
        //do{
            elegir=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para el TP de vectores\nIngrese 2 para el TP de matrices\nIngrese 0 para terminar"));
            switch(elegir){
                case 0:
                    System.exit(0);
                case 1: //caso del práctico de vectores
                    int vector;
                    vector=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ejercicio a realizar: (1-4)"));
                    switch(vector){
                        case 1:
                            Vectores1();
                            break;    
                        case 2:
                            Vectores2();
                            break;
                        case 3:
                            Vectores3();
                            break;
                        case 4:
                            Vectores4();
                            break;
                    }
                    break;
                case 2://caso del práctico de matrices
                    int matriz;
                    matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ejercicio a realizar: (1-5)"));
                    switch(matriz){
                        case 1:
                            Matrices1();    
                        break;
                        case 2:
                            Matrices2();
                        break;
                        case 3:
                            Matrices3();
                        break;
                        case 4:
                            Matrices4();
                            break;
                        case 5:
                            Matrices5();   
                        break;
                    } 
                break;
                default: JOptionPane.showMessageDialog(null, "Ingrese un número válido");
                break;
            }
        //}while((elegir!=1)&&elegir!=2);
        
    }   
}
