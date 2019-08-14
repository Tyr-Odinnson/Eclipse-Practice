package cs105.w3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class maxMinValues {

	public static void main(String[] args) {
		
		Random random = new Random();
		int numberOfElement = random.nextInt(30)+6;//6 is the minimum amount if array items
		
		int[] myArr = new int[numberOfElement];
		//populate randoms
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = random.nextInt(300);
		}
		//sort
		Arrays.parallelSort(myArr);
		System.out.println(Arrays.toString(myArr));
		System.out.println("Min = " + myArr[0]);
		System.out.println("Max = " + myArr[myArr.length-1]);
		
	}

}
