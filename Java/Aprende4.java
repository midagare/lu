import java.util.Scanner;
public class Aprende4{
	public static void main(String[]arg){

		int hora, min, seg;
		Scanner S= new Scanner(System.in);

		 System.out.print("introduce la hora ");
		 hora= S.nextInt();

		 System.out.print("introduce los minutos");
		 min= S.nextInt();

		 System.out.print("introduce los segundos");
		 seg= S.nextInt();


		 if(hora>0 && hora<24 && min>0 && min<60 && seg>0 && seg<60){
			seg+=1;
		
			if(seg==60){
				min+=1;
				seg=0;
			} 	
			if(min==60){
				hora += 1;
				min=0;
			}

			if(hora==24){
				hora= 0;
			}

			System.out.println(hora+":"+min+":"+seg);

		 }
		 else{
		 	System.out.println("la hora introducida no es correcta");

		 }
	}
}