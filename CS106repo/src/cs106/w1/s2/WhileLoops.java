package cs106.w1.s2;

public class WhileLoops {

	public static void main(String[] args) {
		//Print 100 numbers
		int counter = 0;
		while(counter < 10) {
			System.out.println(counter);
			counter++;
		}
		
		char ch = 'A';
		while(ch <= 'z') {
			System.out.println(ch + " ");
			ch++;
		}

	}

}
