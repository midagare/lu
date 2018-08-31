Import util.java.Scanner;
Public Class Determinantes{
	public static void main(String[]args){
	Scanner Numeros= new Scanner(System.in);

	System.out.printnl("Escribe un numero entero que sea el coeficiente de x para la ecuacion 1");
	int a11= Numeros.nextInt(); 

	System.out.printnl("Escribe un numero entero que sea el coeficiente de y para la ecuacion 1");
	int a12= Numeros.nextInt(); 

	System.out.printnl("Escribe un numero entero que sea el coeficiente de x para la ecuacion 2");
	int a21= Numeros.nextInt(); 

	System.out.printnl("Escribe un numero entero que sea el coeficiente de y para la ecuacion 2");
	int a22= Numeros.nextInt(); 

	System.out.printnl("Escribe un numero entero que sea el resultado de la ecuacion 1");
	int b1= Numeros.nextInt(); 

	System.out.printnl("Escribe un numero entero que sea el resultado de la ecuacion 2");
	int b2=Numeros.nextInt(); 

	int det = a11*a22-a12*a21;
	int detx= b1*a22-b2*a12;
	int dety= a11*b2-b1*a21;

	int x= detx/det;
	int y=dety/det;

	System.out.printnl("el valor de x es "+x);
	System.out.printnl("el valor de y es "+y);   

	



	}
}