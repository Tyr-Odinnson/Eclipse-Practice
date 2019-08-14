package cs106.w2.s1;

public class Test {
	public static void main(String[] args) {
		//1. Create a hunter with your name and age
		Hunter humanHunter = new Hunter("Tyr the human-hunter!", 1400);
		// humanHunter.setName("Tyr");
		// humanHunter.setAge(1000);
		//2. Create an array of three wolves
		Wolf[] wolves = new Wolf[3];
		
		//3. Create 3 dogs objs and assign them to the array
		Wolf blackWolf = new Wolf();
		blackWolf.setName("Fenrir");
		blackWolf.setAge(7);
		
		// Wolf whiteWolf = new Wolf();
		// whiteWolf.setName("Freki");
		Wolf whiteWolf = new Wolf("Freki", 2100); //The above 2 commented lines but in one line of code, 
		//This is a custom constructor and doesn't call on the default constructor settings.
		
		Wolf bloodWolf = new Wolf();
		bloodWolf.setName("Garmr");
		
		
		wolves = new Wolf[] {blackWolf, whiteWolf, bloodWolf};
		//4. Assign the array to Wolf[] of the hunter
		humanHunter.setWolves(wolves);
		
		//5. Use loop to make the dogs bark
		for (int i = 0; i <humanHunter.getWolves().length; i++) {
			wolves[i].growl();
		}
	}

}
