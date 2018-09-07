import java.util.Scanner;
public class Fibonacci{

	public static int recuFibonacci(int n){
		if (n>1){
			return recuFibonacci(n-1) + recuFibonacci(n-2); 
		}
		else if (n==1){
			return 1;
		}
		else if (n==0) {
			return 0;
		}
		else{
			System.out.println("debes ingresar un numero mayor que -1");
			return -1;
		}
	}

	public static long iteraFib(int n){
		if(n<0){
			System.out.println("debes ingresar un numero mayor que -1");
			return -1;
		} else if(n<2){
			return n;
		} else {
			long m1 = 0, m2 = 1;
			//int m3;
			for(int i = 2; i <= n; i++){
				/*m3=m1+m2;
				m1=m2;
				m2=m3;*/
				m2 = m1 + m2;
				m1 = m2 - m1;
			}
			return m2;
		}
	}

	public static void main(String[]args){
		Scanner fibonacci= new Scanner(System.in);
		System.out.println("introduce un numero entero positivo");
		int n= fibonacci.nextInt();
		//Fibonacci fib = new Fibonacci();
		//System.out.println( "recurrente: " + Fibonacci.recuFibonacci(n));
		System.out.println( "iterativo: " + Fibonacci.iteraFib(n));
		
	}


}


