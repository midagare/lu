
import java.util.Scanner;
public class bloque2{
	public static void main(String[] arg){
		int x,y;
		Scanner S= new Scanner(System.in);

		System.out.println("introduce un numero");
		x=S.nextInt();

		y= x % 2;

		if(y==0){
			System.out.println("el numero " +x+ " es par");
		} 
		else{
			System.out.println("el nuemro "  +x+ " es impar");
		}


	}
}
