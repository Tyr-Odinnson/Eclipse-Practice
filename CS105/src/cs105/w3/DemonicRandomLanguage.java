package cs105.w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DemonicRandomLanguage {

	public static void main(String[] args) {
		ArrayList<String> stringList = randomWordGenerator();
		System.out.println("Before sort: " + stringList);
		Collections.sort(stringList);
		System.out.println("After sort: " + stringList);
		
		String longest = stringList.get(0);
		for (String s : stringList) {
			if (longest.length() < s.length()) {
				longest = s;
			}
		}
		System.out.println("The longest: " + longest);
		
	}
	
	public static ArrayList<String> randomWordGenerator() {
		//1. Create a random obj and an ArrayList of String
		Random random = new Random();
		ArrayList<String> stringList = new ArrayList<String>();
		//2. Think about random number of Strings, random string length, random chars and how to combine them into some strings
		int numOfStrings = random.nextInt(20) + 5; //At least 5 strings
		for (int i = 0; i < numOfStrings; i++) {
			int numberOfChars = random.nextInt(10)+1;
			String aRandomString = ""; //an empty string
			for (int j = 0; j < numberOfChars; j++) {
				char randomChar = (char) ('a' + random.nextInt(26));
				aRandomString += randomChar;
			}
			//3. Add the string to an array list
			stringList.add(aRandomString);
		}
		return stringList;
	}

}
