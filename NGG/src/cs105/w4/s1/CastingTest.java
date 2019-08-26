package cs105.w4.s1;

public class CastingTest {

	public static void main(String[] args) {
		// TODO 1 Simulate up casting
		Dog d1 = new Dog(); //--> animal
		Animal a1 = d1;// upcasting
		
		//TODO 2 simulate down casting Animal -> Dog (only allow if it is actually a Dog obj) 
		Animal d2 = new Dog();//
		Dog d3 = (Dog) d2;
		
		//TODO 3 create some error of type casting
		Animal a2 = new Animal();
		Dog d4 = (Dog) a2;
	}

}
