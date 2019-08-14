package cs106.w1.s1;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal rabbit = new Animal();
		rabbit.setName("Bunny");
		rabbit.setAge(30);
		
		Animal bbwolf = new Animal();
		bbwolf.setName("Ooway");
		bbwolf.setAge(2);
		
		rabbit.walk();
		bbwolf.walk();
	}

}
