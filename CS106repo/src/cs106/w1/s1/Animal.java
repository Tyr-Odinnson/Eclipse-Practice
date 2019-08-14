package cs106.w1.s1;

public class Animal {
	public Shape myShape;
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void walk() {
		//a wolf runs and a rabbit hops
		if(name.equals("Ooway")) {
			System.out.println("The wolf is running!");
		} else {
			System.out.println("The bun-bun hops ^_^");
		}
		
	}
	
	public void eat(Food food) {
		
	}
	
	public Voice speak() {
		return null;
	}
}
