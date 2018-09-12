public class Test02{
	public static void main(String[] args) {
		
		int n= 1000;
		double p= 0.5;
		try{
			n = Integer.valueOf(args[0]);
		} catch (Exception e){
			System.out.println(e.toString());
			System.out.println("n default en 1000");
		}
		try{
			p = Double.valueOf(args[1]);
		} catch (Exception e){
			System.out.println(e.toString());
			System.out.println("p default en 0.5");
		}
		System.out.println(Dado.binomial());
}
	
}