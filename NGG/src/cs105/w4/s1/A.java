package cs105.w4.s1;

public class A {
	public static void main(String...strings) {
		//Default 15x46 but you can test with different flag sizes
		//Enjoy your weekend
		printUSAFlag(5, 16);
		System.out.println();
		printUSAFlag(10, 46);
	}
	/**
	 * A CRAZY  solution to print a USA flag by Dr Tung.
	 * @param height the height of the flag 
	 * @param width the width of the flag
	 */
	public static void printUSAFlag( int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				
				System.out.print((i < 9*height/15  && j < 12 * width/46) ?
						((i+j) % 2 ==0 && j != 12*width/46 -1)? "*": " "
						:	
						"=");
				
				
//				if(i < 9*height/15  && j < 12 * width/46) {
//					if((i+j) % 2 ==0 && j != 12*width/46 -1) {//the sum of i + j is an even number
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				} else {
//					System.out.print("=");
//				}
//				
				
//				System.out.print(((i< 9*height/15 && j < 12*width/46 )?
//					(((i+j)%2==0 && j != 12*width/46 - 1)?"*":" "):"=" )
//						+(j==width-1?"\n":""));
			}
			System.out.println();
		}
	}
}