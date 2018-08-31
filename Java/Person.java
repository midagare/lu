public class Person {
	private String name;
	public int age;

	public Person(){
		name = "Juan";
		age = 1;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person clone(){
		return new Person(name,age);
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		if(name.length() < 2){
			this.name = null;
			System.out.println("Invalid name");
		} else {
			this.name = name;
		}
	}

	public void happyBirthday(){
		age ++;
	}
	@Override
	public String toString() {
		return "name:"+name+", age:"+age;
	}
}