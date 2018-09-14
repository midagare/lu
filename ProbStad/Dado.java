
public class Dado {
	public static int volado(){
		return bernoulli(0.5);
	}

	public static int bernoulli(double p){
		if(Math.random() < p)
			return 1;
		return 0;
	}

	public static int binomial(int n, double p){
		int unos=0;
		for(int i=0; i<n;i++){
			if (bernoulli(p)==1){
				unos++;
			}
		}
		return unos;
	}
	//programar distribucion binomial en esta clase
	//hacer una clase Test02 para probar la distribucion binomial
}