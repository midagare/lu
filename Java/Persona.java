public class Persona{
	public String nombre;
	private String apellido;
	public int edad;
	private double peso;
	private double estatura;

	public Persona(){
		nombre = "Juan";
		apellido = "Pérez";
		edad = 0;
		peso = 50;
		estatura = 1.6;
	}

	//Este constructor recibe parámetros, recibe nombre y lo pone en el atributo nombre de esta clase
	//Para no confundir a java le hacemos explicito que es a este nombre: this.nombre
	//En estatura no hay que hacerlo porque no hay confusión, pero no pasa nada si ponemos:
	// this.estatura = est
	public Persona(String nombre, String apellido, int edad, double peso, double est){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.peso = peso;
		estatura = est;
	}

	//Este es un método de una persona para contar, pero para que una persona cuente
	//debe primero existir la persona...
	public void contar(int n){
		System.out.println(nombre + " cuenta así..\n");
		for(int i =0; i < n; i++){
			System.out.println((i+1));
		}
	}

	public String toString(){
		return "nombre: " + nombre
			+ ", apellido: " + apellido
			+ ", edad: " + edad + " años"
			+ ", peso: " + peso + " kg."
			+ ", estatura: "+ estatura + " m";
	}
}