import java.util.Scanner;
public class factoriales{
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
	} 
}
