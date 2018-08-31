import java.util.Scanner;
public class 3x3{
	public static void main (String[]args){
		Scanner Numeros = new Scanner(System.in);

		System.out.println("Escribe un numero entero que sea el coeficiente de x para la ecuacion 1");
	int x1= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el coeficiente de y para la ecuacion 1");
	int y1= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el coeficiente de z para la ecuacion 1");
	int z1= Numeros.nextInt();

	System.out.println("Escribe un numero entero que sea el resultado de la ecuacion 1");
	int d1= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el coeficiente de x para la ecuacion 2");
	int x2= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el coeficiente de y para la ecuacion 2");
	int y2= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el coeficiente de z para la ecuacion 2");
	int z2= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el resultado de tu ecuacion 2");
	int d2= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el coeficiente de x para la ecuacion 3");
	int x3= Numeros.nextInt();

	System.out.println("Escribe un numero entero que sea el coeficiente de y para la ecuacion 3");
	int y3= Numeros.nextInt();  

	System.out.println("Escribe un numero entero que sea el coeficiente de z para la ecuacion 3");
	int z3= Numeros.nextInt(); 

	System.out.println("Escribe un numero entero que sea el resultado de la ecuacion 3");
	int d3= Numeros.nextInt(); 

	int det= x1*(y2*z3-z2*y3)-y1*(x2*z3-z2*x3)+z1*(x2*y3-y2*x3);
	int detx=d1*(y2*z3-z2*y3)-y1*(d2*z3-z2*d3)+z1*(d2*y3-y2*d3);
	int dety=x1*(d2*z3-z2*d3)-d1*(x2*z3-z2*x3)+z1*(x2*d3-d2*x3);
	int detz=x1*(y2*d3-d2*y3)-y1*(x3*d3-d2*x3)+d1*(x2*y3-y2*x3);

	int x=detx/det;
	int y=dety/det;
	int z=detz/det;

	System.out.println("el valor de x es "+x);
	System.out.println("el valor de y es "+y);
	System.out.println("el valor de z es "+z);
	










	}
	

}