package cs105.w2;

public class ICEx3 {

public static void main(String[] args) {
	// 1. Declare an array of 400 elements
	int[][] myArr = new int[2][3];
	// 2. Use a for loop to set values to cells
	for (int i = 0; i < myArr.length; i++) {
		
		for (int k = 0; k < myArr[0].length; k++) {
			myArr[i][k] = 1;
			
			}
		
		
		
		}
for (int i = 0; i < myArr.length; i++) {
		
		for (int k = 0; k < myArr[i].length; k++) {
			
			System.out.print("[" + i + "]" + "[" + k + "]:" + myArr[i][k] + " ");
			
			// System.out.print(myArr[i][k]);
			}
		
		
		System.out.println();
		}
	
	}
}