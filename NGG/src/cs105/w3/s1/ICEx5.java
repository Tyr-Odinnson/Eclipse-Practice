package cs105.w3.s1;

import java.util.Scanner;

public class ICEx5 {

	public static void main(String[] args) {
		//1. Input message 1
		System.out.print("Enter a: ");
		//2. get a
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//3. input message 2
		System.out.print("Enter b: ");
		//4. get b
		int b = sc.nextInt();
		//5. Input message 3
		System.out.print("Select an op (+/-/x/÷/%): ");
		//6. get operator
		sc.nextLine();//clear scanner
		String op = sc.nextLine();
		System.out.println(op);
		//7. switch
		switch (op) {
		case "+":
			System.out.println(a + op + b+ " = " + (a+b));
			break;
		case "-":
			System.out.println(a + op + b+ " = " + (a-b));
			break;
		case "x":
			System.out.println(a + op + b+ " = " + (a*b));
			break;
		case "/":
			try {
				System.out.println(a + op + b+ " = " + (a/b));
			} catch(Exception e) {
				System.out.println("b should not be 0!");
			}
			break;
		case "%":
			try {
				System.out.println(a + op + b+ " = " + (a%b));
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println("b should not be 0!");
			}
			break;
		default:
			System.out.println("R U kidding me!!!????");
			break;
		}
	}

}
