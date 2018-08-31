import java.util.Scanner;
public class Scanner{
	public static void main (String[] args){
	int entero;
	Scanner teclado= new Scanner(System.in);
	System.out.println("escribe un numero entero");
	entero= teclado.nextInt();
	System.out.println("este es tu numero"+entero);
	

	}
} 