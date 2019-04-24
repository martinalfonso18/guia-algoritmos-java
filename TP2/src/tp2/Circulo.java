package tp2;
public class Circulo {
    //atributos
    private final double PI = 3.14f;
    protected double radio;
    protected float espesor;
    
    //metodos
    public double superficie(){
        return (PI*radio*radio);
    }
    public float perimetro(){
        return (float)(PI*radio*2);
    }
    public float costo(){
        return (float)(superficie()*Trapecio.PRECIO*espesor);
    }
    
    public void setRadio(float radio){
        this.radio = radio;
    }
    public float getRadio(){
        return (float)radio;
    }
    
    //constructores
    public Circulo(float espesor){
        this.espesor = espesor;
    }
}
