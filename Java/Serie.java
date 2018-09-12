import java.util.Scanner;
public class Serie{
	public static int recuFibonacci(int n){
	
		if (n>1){
			return recuFibonacci(n-1)+ recurrente(n-2); 
		}
		else if (n==1){
			return 1;
		}
		else if (n==0) {
			return 0;
		}
		else{
			System.out.println("debes ingresar un numero mayor que -1");
		}
	}


	public static void main(String[]args){
		Scanner fibonacci= new Scanner(System.in);
		System.out.println("introduce un numero entero positivo");
		int n= fibonacci.nextInt();

		System.out.println( "recurrente" + Serie.recuFibonacci(n));
		
	}


}


