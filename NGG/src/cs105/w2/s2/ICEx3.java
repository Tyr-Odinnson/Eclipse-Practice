package cs105.w2.s2;

public class ICEx3 {

	public static void main(String[] args) {
		//1. Declare
		int[][] my2dArr = new int[2][3];
		//2. A nested-Loop to assign
		for (int i = 0; i < my2dArr.length; i++) {//row by row
			for (int j = 0; j < my2dArr[0].length; j++) {//col by col
				my2dArr[i][j] = 1;
			}
		}
		
		//3. Print
		for (int i = 0; i < my2dArr.length; i++) {
			for (int j = 0; j < my2dArr[i].length; j++) {//anther way
				System.out.print(" " + my2dArr[i][j]);
			}
			System.out.println();
		}
		
	}

}
