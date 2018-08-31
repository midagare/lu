import java.util.Scanner;
public class Operadores{
	public static void main(String[] args){
		Scanner numero=new Scanner(System.in);
		
		System.out.println("escriba un numero entero");
		int numero1= numero.nextInt();

		System.out.println("escriba un numero entero");
		int numero2=numero.nextInt();
		 if(numero1==numero2) System.out.println(numero1+" y "+numero2+ " son iguales");
		 if(numero1!=numero2) System.out.println(numero1+" y "+numero2+" NO son iguales");
		 if(numero1<numero2)  System.out.println(numero1+" es < que "+ numero2);
		 if(numero1>numero2)  System.out.println(numero1+" es > que "+ numero2);
		 if(numero1>=numero2) System.out.println(numero1+ " es >= que "+ numero2);
		 if(numero1<=numero2) System.out.println(numero1+ " es <= que "+ numero2);	
		 //&&   ||   &  |  


	}
}