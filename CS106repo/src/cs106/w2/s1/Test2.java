package cs106.w2.s1;

public class Test2 {

	public static void main(String[] args) {
			Hunter humanHunter = new Hunter("Tyr the human-hunter!", 1400, new Wolf[] {new Wolf("Fenrir", 700), new Wolf("Freki", 777), new Wolf("Garmr", 980)});
					for (Wolf wolf : humanHunter.getWolves()) {
						wolf.growl();
					}
	}

}
