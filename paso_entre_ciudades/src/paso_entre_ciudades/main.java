package paso_entre_ciudades;

public class main {

	public static void main(String[] args) {
		
		Ciudad pr1[] = new Ciudad[1];
		

		Ciudad pr2[] = new Ciudad[1];
		
		
		Ciudad pr3[] = new Ciudad[1];
		
		
		Ciudad c1 = new Ciudad("Buenos Aires",1,3,null);
		Ciudad c2 = new Ciudad("Santa Fe",1,2,pr1);
		Ciudad c3 = new Ciudad("Cordoba",1,3,pr2);
		Ciudad c4 = new Ciudad("San Luis",2,1,pr3);
		Ciudad c5 = new Ciudad("San Juan",3,1,null);
		Ciudad c6 = new Ciudad("La Pampa",4,3,pr1);
		
		pr1[0] = c1;
		pr2[0] = c2;
		pr3[0] = c3;
		
		
		Ciudad pr[] = new Ciudad[3];
		pr[0] = c4;
		pr[1] = c5;
		pr[2] = c6;
		
		Ciudad c7 = new Ciudad("Mendoza",5,5,pr);
		
		c7.mostrar();
		c6.mostrar();
		c5.mostrar();
		c4.mostrar();
		c3.mostrar();
		c2.mostrar();
		c1.mostrar();
	}

}
