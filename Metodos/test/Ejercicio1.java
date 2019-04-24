/*
1)	Diseñe un algoritmo que llene una matriz de 10 * 10 y determine:
A)	El número mayor almacenado en la matriz.
B)	El número mayor almacenado en cada fila.
C)	La columna que tuvo la máxima suma..
D)	La fila que tuvo la máxima suma.
Diseña una función para cada inciso.

 */


public class Ejercicio1 {
    
    public static int [][] m= new int[10][10];
    //funciones
    
   static int CadaFila(int m[][],int i,int j,int b){
         if(m[i][j]>b){
            b=m[i][j];
        }
        return b;   
   }
    static int Mayor(int m[][],int i,int j,int a){
        
        if(m[i][j]>a){
            a=m[i][j];
        }
        return a;
    }
    static int MaxC(int [][]m, int d, int g, int cual){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length; j++){
                d+=m[j][i];
            }
            if (d>g){
                g=d;
                cual=i;
            }
            d=0; 
        }    
        return cual;
    }
    static int MaxF(int [][] m, int f, int f2, int cual){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length; j++){
                f+=m[i][j];
            }
            if (f>f2){
                f2=f;
                cual=i;
            }
            f=0; 
        }    
        return cual;
    }
    
    //procedimientos
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0,cual=0,f=0,f2=0,g=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                m[i][j]=(int)(Math.random()*10)+1;
                System.out.println("Fila "+(i+1)+" columna"+(j+1)+" = "+m[i][j]);
                a=Mayor(m,i,j,a);
                b=CadaFila(m,i,j,b);
               
            }
            System.out.println("El mayor numero de la fila es: "+b);
            b=0;
        }
        System.out.println("El mayor numero de la matriz es: "+a);
        System.out.println("La mayor fila es igual a "+MaxF(m,f,f2,cual)+1);
        System.out.println("La mayor columna es igual a  "+MaxC(m,d,g,cual)+1);
    }
    
}

