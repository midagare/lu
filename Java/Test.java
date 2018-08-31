public class Test{
	public static void main(String args[]){
		System.out.println("Aquí vamos a probar todo, es el método main");
		Persona p = new Persona();// creamos una persona
		Persona q = new Persona("Lucero", "Couoh", 28, 45.3, 1.50);
		Persona r = new Persona("Miguel", "Garrdio", 27, 71.2, 1.60);
		r.nombre = "Daniel";
		r.edad = 28;
		q.edad= 15;
		System.out.println("Persona p: \n" + p.toString()); //imprimimos a la persona usa nuestro método toString
		System.out.println("Persona q: \n" + q.toString());
		System.out.println("Persona r: \n" + r.toString());
		q.contar(10);
	}
}