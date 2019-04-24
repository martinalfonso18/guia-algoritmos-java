/*
 
 */

/**

* 
 */
public class NewClass {
    public static int variableEstatica=7;
    public static int recibe(int a){
        variableEstatica+=a;
        return a;
    }
    
    public static void main(String args[]){
        int h=9;
        System.out.println("h= "+h);
        System.out.println("variableEstatica= "+variableEstatica);
        
        h=recibe(h);
        
        System.out.println("h= "+h);
        System.out.println("variableEstatica= "+variableEstatica);
    }
    
}
