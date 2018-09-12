public class Test01 {
	public static void main (String args[]){
		//System.out.println("volado:"+Dado.volado());
		int n = 1000, s1 = 0, s2 = 0;
		double p = 0.5;
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
		for(int i = 0; i < n; i++){
			//if(Dado.volado() == 1) //volado simple
			if(Dado.bernoulli(p) == 1)
				s2++;
			else
				s1++;
		}
		System.out.println("Volados:"+n);
		System.out.println("soles:"+s1);
		System.out.println("aguilas:"+s2);
	}
}