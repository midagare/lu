import java.util.Scanner;

public class Entradas{
	public static void main (String[] args){
	int entero;
	Scanner teclado= new Scanner(System.in);
	System.out.println("escribe un numero entero mayor que 1");
	entero= teclado.nextInt();
	System.out.print("\n\nAscending\n");
	for(int contador=entero; contador>=1; contador--){
		for(int j = contador; j>=1; j--)
			System.out.print("*");
		System.out.print("\n");
	}
	System.out.print("\n\nDescending\n");
	for(int contador=1; contador<=entero; contador++){
		for(int j= 1; j<=contador; j ++)
			System.out.print("*");
		System.out.print("\n");
	}
	System.out.println();

	int i =1;
	for(;i<=entero;){
	//while(i<=entero){
		System.out.println(i--);
		if(i==-6){break;}
	}

	}
} 