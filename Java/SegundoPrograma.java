public class SegundoPrograma{
	public static void unMetodo(){
		System.out.println("Imprime el metodo");
	}

	public static void main(String args[]){
		if(args.length > 0){
			int n = Integer.valueOf(args[0]);
			for(int i =0; i<n; i++){
				SegundoPrograma.unMetodo();
			}
		}
	}
}