
public class Dado {
	public static int volado(){
		/*
		if(Math.random() < 0.5)
			return false;
		return true;
		*/
		return bernoulli(0.5);
	}

	public static int bernoulli(double p){
		if(Math.random() < p)
			return 1;
		return 0;
	}

	public static int binomial(int n, double p){
		int soles=0;
		for(int i=0; i<n;i++){
			//System.out.prinln
			if (bernoulli(p)==1){
				soles++;
			}
		}
		return(soles);

	//programar distribucion binomial en esta clase
	//hacer una clase Test02 para probar la distribucion binomial
		}
}