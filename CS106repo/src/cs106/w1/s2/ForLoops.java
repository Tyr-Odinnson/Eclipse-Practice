package cs106.w1.s2;

public class ForLoops {

	public static void main(String[] args) {
		// For loop examples
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			
		}
		
		//The second for loop from 100 -> 0? How?
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		//The 3rd for loop from 100, 97, 94, ...1? How?
		for (int i = 100; i >= 0; i = i - 3) {
			System.out.println(i);
		}
		
		//TODO: Print out the alphabet with char and a loop
		char c;
        for(c = '!'; c <= '~'; ++c)
            System.out.print(c + " ");
        
    	//TODO: Your frenemy challenges U: 1 + 2 + ... + 100 = ?
    	//Write the code to complete the challenge
        //1. Declare a variable to store (remember) the sum
        //2. Create a loop of 100 iterations
        //3. Update the value of the sum inside the loop
        //4. Print the final result
    	
//        int num = 100, sum = 0;
//    	
//    	for(int i = 1; i <= num; ++i)
//    	{
//    		//sum = sum +i;
//    		sum += i;
//    	}
//    	System.out.println("Sum = " + sum);
        int sum = 0; //step 1
        for(int i = 0; i <= 100; i++) {//step 2
        	sum = sum + i; //step 3
        }
        System.out.println("Sum = " + sum);
		
	}
	
}
