public class Ciao{
	public static void main(String args[]){
		//System.out.println("ciao mondo!!!");
		if(args != null && args.length > 0 && args[0].equals("-version")){
			System.out.println("This is the 1.0.0 version of Ciao program");
		} else if (args != null && args.length > 0 && args[0].equals("-demo")) {
			int r = 5;
			int s = r;
			System.out.println("r::"+r);
			System.out.println("s::"+s);
			s = 3;
			System.out.println("r::"+r);
			System.out.println("s::"+s);

			Person p1 = new Person();
			Person p2 = new Person("Lu", 25);
			Person p3 = p2.clone();
			System.out.println("p2::"+p2);
			System.out.println("p3::"+p3);
			p3.age = 35;
			System.out.println("p2::"+p2);
			System.out.println("p3::"+p3);
			System.out.println(p2.toString());
			//p1.name = "Mike";
			p1.setName("Mike");
			p1.age=28;
			System.out.println(p1.toString());
			if(args.length > 1){
				//Manejo de Excepciones
				try{
					int n = Integer.valueOf(args[1]);
					for(int i = 0; i < n; i++){
						System.out.println("Happy Birthday " + p2.getName() + "!!!");
						p2.happyBirthday();
						System.out.println(p2 + "\n\n");
					}
				} catch (Exception e) {
					System.out.println("Invalid argument in -demo: would be a number");
				}
			}
		} else {
			System.out.println("-version |  to know the version");
			System.out.println("-demo    |  to run demo of person");
		}
	}
} 