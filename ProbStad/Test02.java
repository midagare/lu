public class Test02{
	public static void main(String[] args) {
		int m = 1000;
		int n = 3;
		double p = 0.5;
		try{
			m = Integer.valueOf(args[0]);
		} catch (Exception e){
			System.out.println(e.toString());
			System.out.println("m default en 1000");
		}
		try{
			n = Integer.valueOf(args[1]);
		} catch (Exception e){
			System.out.println(e.toString());
			System.out.println("n default en 3");
		}
		try{
			p = Double.valueOf(args[2]);
		} catch (Exception e){
			System.out.println(e.toString());
			System.out.println("p default en 0.5");
		}

		int binDist[] = new int[n+1];

		for(int i = 0; i < m; i++){
			binDist[Dado.binomial(n,p)]++;
		}
		
		for(int i = 0; i < n+1; i++){
			System.out.println("R"+i+"="+binDist[i]);
		}
	}
}