	package cs106.w2.s1;

public class Wolf {
	
	private String name;
	private int age; //Global or instance variable
	
	//Default constructor
	public Wolf() {
		System.out.println("D-Con: a new wolf is born!");
	}
	
	//Custom constructor
	public Wolf(String newName, int age) {
		this();//Calls the default constructor inside custom
		this.name = newName;
		this.age = age;
		
	}
	
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
	
	public void growl() {
		System.out.println("Grr! Argh! " + name);
	}

}
