package cs105.w2.s2;

public class ICEx2 {

	public static void main(String[] args) {
		//1. declare an array of 400 int elements
		int[] myArr = new int[400];
		//2. use a for loop to set values to cells
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = i + 1;
		}
		//3. Print all out 

		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}

}
