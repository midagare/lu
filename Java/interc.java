import java.util.Scanner;
public class interc{
	public static void main (String[] arg){
		int a,b,c;
		Scanner S = new Scanner(System.in);

		System.out.print("introduce el valor para A:");
		a = S.nextInt();

		System.out.print("introduce el valor para B:");
		b = S.nextInt();

		c=a;
		a=b;
		b=c;

		System.out.println("el nuevo valor de A es:" +a);
		System.out.println("el nuevo valor de B es:" +b);


	}
}
