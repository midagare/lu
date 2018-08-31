import java.util.Scanner;

public class Aprende3{
	public static void main(String[]arg){

		int x;
		Scanner S= new Scanner(System.in);

		System.out.println("introduce un numero");
		x= S.nextInt();

		if(x>0 && x<10){//&& = y  ||= o 
			System.out.println("el numero introducido es mayor que 0 o menor que 10");
		}
		else{
			System.out.println("el numero introducciodo no se encuentra entre 0 y 10");

		}

	}
}