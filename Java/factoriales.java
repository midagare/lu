import java.util.Scanner;
//Revisando
public class factoriales{
	
	public static int iteraFactorial(int n){
		int fac = 1;
		for(int i = 1; i <= n; i++)
			fac *= i;
		return fac;
			
	} 
	public static int recurreFactorial(int n){
		if(n < 2)
			return 1;
		return n*recurreFactorial(n-1);
	}

	public static void main(String[]args){
		Scanner Factorial= new Scanner(System.in);
		int n;
		int fac=1;

		System.out.println("introduce un numero entero positivo");
		int f= Factorial.nextInt();
		
		for ( int i=f;i>=1;i--){
			fac= fac*i;
			//System.out.println(i);
			//System.out.println();
		}
		System.out.println(fac);

		System.out.println("iterativo:" + iteraFactorial(f));
		System.out.println("recurrente:" + recurreFactorial(f));
	}
}
