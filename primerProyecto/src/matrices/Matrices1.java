/* operar matrices
        for(int i=0;i<3;i++){ // llenar la matriz
            for(int j=0;j<3;j++){
                
            }  
        }
*/
package matrices;

/**
 *
 * @author Riva
 */
public class Matrices1 {
    public static void main(String[] args){
        
        int x[][];
        x= new int[3][3];
        x[0][0]=1;
        x[0][1]=2;
        x[0][2]=3;
        
        System.out.println(x[0][2]);
        for(int i=0;i<3;i++){ // llenar la matriz
            for(int j=0;j<3;j++){
                System.out.println("El valor de columna "+(j+1)+" fila "+(i+1)+" es "+x[i][j]);
            }
            
        }
        
    }
}
