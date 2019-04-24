package tp2;


public class Trapecio {
    //atributos
    protected float altura;
    private float bMayor;
    private float bMenor;
    protected float espesor;
    public static final float PRECIO = 10f;
    //metodos
    public double superficie(){
        return ((bMenor + bMayor) * altura)/2;
    }
    public float perimetro(){
        return (bMenor + bMayor + altura + (altura * (1/4))); 
    }
    public float costo(){
        return ((float)superficie()*PRECIO*espesor);
    }
    public void setBMayor(float bMayor){
        this.bMayor = bMayor;
    }
    public void setBMenor(float bMenor){
        this.bMenor = bMenor;
    }
    public float getBMayor(){
        return bMayor;
    }
    public float getBMenor(){
        return bMenor;
    }
    public double getPRECIO(){
        return PRECIO;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    //constructores
    public Trapecio(float espesor){
        this.espesor = espesor;
    }
}
