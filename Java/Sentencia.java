import java.util. Scanner;
public class Sentencia {
	public static void main (String[] arg){

		double temp; 
		Scanner S =  new Scanner(System.in);

		System.out.println("Introduce una temperatura");
		temp = S.nextDouble();

		if( temp>30){
			System.out.println("hace mucho calor");
		}
		else if(temp>25){
			System.out.println("la temperatura es normal");
		}
		else if(temp>20){
			System.out.println("hace un pocon de frio");
		}
		else if(temp>15){
			System.out.println("hace frio");
		}
		else {
			System.out.println("hace mucho frio");
		}

		System.out.println("estoy fuera");

	}
} 